package com.kamiruku.calculator


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NiceDataItem(
    @SerialName("atkBase")
    val atkBase: Int = 0,
    @SerialName("atkGrowth")
    val atkGrowth: List<Int> = listOf(),
    @SerialName("atkMax")
    val atkMax: Int = 0,
    @SerialName("attribute")
    val attribute: String = "",
    @SerialName("battleName")
    val battleName: String = "",
    @SerialName("cardDetails")
    val cardDetails: CardDetails = CardDetails(),
    @SerialName("cards")
    val cards: List<String> = listOf(),
    @SerialName("classId")
    val classId: Int = 0,
    @SerialName("className")
    val className: String = "",
    @SerialName("classPassive")
    val classPassive: List<ClassPassive> = listOf(),
    @SerialName("collectionNo")
    val collectionNo: Int = 0,
    @SerialName("co-st")
    val cost: Int = 0,
    @SerialName("extraAssets")
    val extraAssets: ExtraAssets = ExtraAssets(),
    @SerialName("gender")
    val gender: String = "",
    @SerialName("growthCurve")
    val growthCurve: Int = 0,
    @SerialName("hitsDistribution")
    val hitsDistribution: HitsDistribution = HitsDistribution(),
    @SerialName("id")
    val id: Int = 0,
    @SerialName("lvMax")
    val lvMax: Int = 0,
    @SerialName("name")
    val name: String = "",
    @SerialName("noblePhantasms")
    val noblePhantasms: List<NoblePhantasm> = listOf(),
    @SerialName("originalBattleName")
    val originalBattleName: String = "",
    @SerialName("originalName")
    val originalName: String = "",
    @SerialName("rarity")
    val rarity: Int = 0,
    @SerialName("relateQuestIds")
    val relateQuestIds: List<Int> = listOf(),
    @SerialName("ruby")
    val ruby: String = "",
    @SerialName("skillMaterials")
    val skillMaterials: SkillMaterials? = null,
    @SerialName("skills")
    val skills: List<Skill> = listOf(),
    @SerialName("traits")
    val traits: List<Trait> = listOf(),
    @SerialName("type")
    val type: String = "",
) {

    @Serializable
    data class CardDetails(
        @SerialName("arts")
        val arts: Arts? = null,
        @SerialName("buster")
        val buster: Buster? = null,
        @SerialName("extra")
        val extra: Extra? = null,
        @SerialName("quick")
        val quick: Quick? = null,
    ) {
        @Serializable
        data class Arts(
            @SerialName("attackIndividuality")
            val attackIndividuality: List<AttackIndividuality> = listOf(),
            @SerialName("attackType")
            val attackType: String = "",
            @SerialName("hitsDistribution")
            val hitsDistribution: List<Int> = listOf()
        ) {
            @Serializable
            data class AttackIndividuality(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )
        }

        @Serializable
        data class Buster(
            @SerialName("attackIndividuality")
            val attackIndividuality: List<AttackIndividuality> = listOf(),
            @SerialName("attackType")
            val attackType: String = "",
            @SerialName("hitsDistribution")
            val hitsDistribution: List<Int> = listOf()
        ) {
            @Serializable
            data class AttackIndividuality(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )
        }

        @Serializable
        data class Extra(
            @SerialName("attackIndividuality")
            val attackIndividuality: List<AttackIndividuality> = listOf(),
            @SerialName("attackType")
            val attackType: String = "",
            @SerialName("hitsDistribution")
            val hitsDistribution: List<Int> = listOf()
        ) {
            @Serializable
            data class AttackIndividuality(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )
        }

        @Serializable
        data class Quick(
            @SerialName("attackIndividuality")
            val attackIndividuality: List<AttackIndividuality> = listOf(),
            @SerialName("attackType")
            val attackType: String = "",
            @SerialName("hitsDistribution")
            val hitsDistribution: List<Int> = listOf()
        ) {
            @Serializable
            data class AttackIndividuality(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )
        }
    }

    @Serializable
    data class ClassPassive(
        @SerialName("detail")
        val detail: String = "",
        @SerialName("functions")
        val functions: List<Function> = listOf(),
        @SerialName("icon")
        val icon: String = "",
        @SerialName("id")
        val id: Int = 0,
        @SerialName("name")
        val name: String = "",
        @SerialName("num")
        val num: Int = 0,
        @SerialName("originalName")
        val originalName: String = "",
        @SerialName("priority")
        val priority: Int = 0,
        @SerialName("ruby")
        val ruby: String = "",
        @SerialName("strengthStatus")
        val strengthStatus: Int = 0,
        @SerialName("type")
        val type: String = "",
    ) {
        @Serializable
        data class Function(
            @SerialName("buffs")
            val buffs: List<Buff> = listOf(),
            @SerialName("funcId")
            val funcId: Int = 0,
            @SerialName("funcPopupIcon")
            val funcPopupIcon: String? = null,
            @SerialName("funcPopupText")
            val funcPopupText: String = "",
            @SerialName("funcTargetTeam")
            val funcTargetTeam: String = "",
            @SerialName("funcTargetType")
            val funcTargetType: String = "",
            @SerialName("funcType")
            val funcType: String = "",
            @SerialName("functvals")
            val functvals: List<Functval> = listOf(),
            @SerialName("script")
            val script: Script? = null,
            @SerialName("svals")
            val svals: List<Sval> = listOf()
        ) {
            @Serializable
            data class Buff(
                @SerialName("buffGroup")
                val buffGroup: Int = 0,
                @SerialName("ckOpIndv")
                val ckOpIndv: List<CkOpIndv> = listOf(),
                @SerialName("ckSelfIndv")
                val ckSelfIndv: List<CkSelfIndv> = listOf(),
                @SerialName("detail")
                val detail: String = "",
                @SerialName("icon")
                val icon: String = "",
                @SerialName("id")
                val id: Int = 0,
                @SerialName("maxRate")
                val maxRate: Int = 0,
                @SerialName("name")
                val name: String = "",
                @SerialName("originalName")
                val originalName: String = "",
                @SerialName("originalScript")
                val originalScript: OriginalScript? = null,
                @SerialName("script")
                val script: Script? = null,
                @SerialName("tvals")
                val tvals: List<Tval> = listOf(),
                @SerialName("type")
                val type: String = "",
                @SerialName("vals")
                val vals: List<Val> = listOf()
            ) {
                @Serializable
                data class CkOpIndv(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = "",
                    @SerialName("negative")
                    val negative: Boolean? = null
                )

                @Serializable
                data class CkSelfIndv(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class OriginalScript(
                    @SerialName("checkIndvType")
                    val checkIndvType: Int? = null,
                    @SerialName("INDIVIDUALITIE")
                    val iNDIVIDUALITIE: Int? = null,
                    @SerialName("IncludeIgnoreIndividuality")
                    val includeIgnoreIndividuality: Int? = null,
                    @SerialName("ProgressSelfTurn")
                    val progressSelfTurn: Int? = null,
                    @SerialName("relationId")
                    val relationId: Int? = null,
                    @SerialName("relationOverwrite")
                    val relationOverwrite: List<RelationOverwrite>? = null,
                    @SerialName("TargetIndiv")
                    val targetIndiv: Int? = null
                ) {
                    @Serializable
                    data class RelationOverwrite(
                        @SerialName("atkClass")
                        val atkClass: Int = 0,
                        @SerialName("atkSide")
                        val atkSide: Int = 0,
                        @SerialName("damageRate")
                        val damageRate: Int = 0,
                        @SerialName("defClass")
                        val defClass: Int = 0,
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("type")
                        val type: Int = 0
                    )
                }

                @Serializable
                data class Script(
                    @SerialName("checkIndvType")
                    val checkIndvType: Int? = null,
                    @SerialName("INDIVIDUALITIE")
                    val iNDIVIDUALITIE: INDIVIDUALITIE? = null,
                    @SerialName("IncludeIgnoreIndividuality")
                    val includeIgnoreIndividuality: Int? = null,
                    @SerialName("ProgressSelfTurn")
                    val progressSelfTurn: Int? = null,
                    @SerialName("relationId")
                    val relationId: RelationId? = null,
                    @SerialName("TargetIndiv")
                    val targetIndiv: TargetIndiv? = null
                ) {
                    @Serializable
                    data class INDIVIDUALITIE(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )

                    @Serializable
                    data class RelationId(
                        @SerialName("atkSide")
                        val atkSide: AtkSide = AtkSide(),
                        @SerialName("defSide")
                        val defSide: DefSide? = null
                    ) {
                        @Serializable
                        data class AtkSide(
                            @SerialName("alterEgo")
                            val alterEgo: AlterEgo = AlterEgo()
                        ) {
                            @Serializable
                            data class AlterEgo(
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler()
                            ) {
                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }
                        }

                        @Serializable
                        class DefSide
                    }

                    @Serializable
                    data class TargetIndiv(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = "",
                        @SerialName("negative")
                        val negative: Boolean = false
                    )
                }

                @Serializable
                data class Tval(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class Val(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )
            }

            @Serializable
            data class Functval(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = "",
                @SerialName("negative")
                val negative: Boolean? = null
            )

            @Serializable
            class Script

            @Serializable
            data class Sval(
                @SerialName("Count")
                val count: Int? = null,
                @SerialName("OnField")
                val onField: Int? = null,
                @SerialName("OnFieldCount")
                val onFieldCount: Int? = null,
                @SerialName("Rate")
                val rate: Int? = null,
                @SerialName("ShowQuestNoEffect")
                val showQuestNoEffect: Int? = null,
                @SerialName("ShowState")
                val showState: Int? = null,
                @SerialName("Turn")
                val turn: Int? = null,
                @SerialName("UseRate")
                val useRate: Int? = null,
                @SerialName("Value")
                val value: Int? = null,
                @SerialName("Value2")
                val value2: Int? = null
            )
        }

    }

    @Serializable
    data class ExtraAssets(
        @SerialName("charaGraph")
        val charaGraph: CharaGraph = CharaGraph(),
        @SerialName("faces")
        val faces: Faces = Faces(),
    ) {

        @Serializable
        data class CharaGraph(
            @SerialName("ascension")
            val ascension: Ascension = Ascension(),
        ) {
            @Serializable
            data class Ascension(
                @SerialName("0")
                val x0: String? = null,
                @SerialName("1")
                val x1: String? = null,
                @SerialName("2")
                val x2: String? = null,
                @SerialName("3")
                val x3: String? = null,
                @SerialName("4")
                val x4: String? = null
            )

        }

        @Serializable
        data class Faces(
            @SerialName("ascension")
            val ascension: Ascension = Ascension(),
        ) {
            @Serializable
            data class Ascension(
                @SerialName("0")
                val x0: String? = null,
                @SerialName("1")
                val x1: String? = null,
                @SerialName("2")
                val x2: String? = null,
                @SerialName("3")
                val x3: String? = null,
                @SerialName("4")
                val x4: String? = null
            )

        }

    }

    @Serializable
    data class HitsDistribution(
        @SerialName("arts")
        val arts: List<Int>? = null,
        @SerialName("buster")
        val buster: List<Int>? = null,
        @SerialName("extra")
        val extra: List<Int>? = null,
        @SerialName("quick")
        val quick: List<Int>? = null,
        @SerialName("strength")
        val strength: List<Int>? = null,
        @SerialName("weak")
        val weak: List<Int>? = null
    )

    @Serializable
    data class NoblePhantasm(
        @SerialName("card")
        val card: String = "",
        @SerialName("detail")
        val detail: String? = null,
        @SerialName("effectFlags")
        val effectFlags: List<String> = listOf(),
        @SerialName("functions")
        val functions: List<Function> = listOf(),
        @SerialName("icon")
        val icon: String = "",
        @SerialName("id")
        val id: Int = 0,
        @SerialName("individuality")
        val individuality: List<Individuality> = listOf(),
        @SerialName("name")
        val name: String = "",
        @SerialName("npDistribution")
        val npDistribution: List<Int> = listOf(),
        @SerialName("npGain")
        val npGain: NpGain = NpGain(),
        @SerialName("npNum")
        val npNum: Int = 0,
        @SerialName("npSvts")
        val npSvts: List<NpSvt> = listOf(),
        @SerialName("num")
        val num: Int = 0,
        @SerialName("originalName")
        val originalName: String = "",
        @SerialName("priority")
        val priority: Int = 0,
        @SerialName("rank")
        val rank: String = "",
        @SerialName("ruby")
        val ruby: String = "",
        @SerialName("script")
        val script: Script? = null,
        @SerialName("strengthStatus")
        val strengthStatus: Int = 0,
        @SerialName("type")
        val type: String = "",
        @SerialName("unmodifiedDetail")
        val unmodifiedDetail: String? = null
    ) {
        @Serializable
        data class Function(
            @SerialName("buffs")
            val buffs: List<Buff> = listOf(),

            @SerialName("funcId")
            val funcId: Int = 0,
            @SerialName("funcPopupIcon")
            val funcPopupIcon: String? = null,
            @SerialName("funcPopupText")
            val funcPopupText: String = "",
            @SerialName("funcTargetTeam")
            val funcTargetTeam: String = "",
            @SerialName("funcTargetType")
            val funcTargetType: String = "",
            @SerialName("funcType")
            val funcType: String = "",
            @SerialName("funcquestTvals")
            val funcquestTvals: List<FuncquestTval> = listOf(),
            @SerialName("functvals")
            val functvals: List<Functval> = listOf(),
            @SerialName("script")
            val script: Script? = null,
            @SerialName("svals")
            val svals: List<Sval> = listOf(),
            @SerialName("svals2")
            val svals2: List<Svals2> = listOf(),
            @SerialName("svals3")
            val svals3: List<Svals3> = listOf(),
            @SerialName("svals4")
            val svals4: List<Svals4> = listOf(),
            @SerialName("svals5")
            val svals5: List<Svals5> = listOf(),
            @SerialName("traitVals")
            val traitVals: List<TraitVal>? = null
        ) {
            @Serializable
            data class Buff(
                @SerialName("buffGroup")
                val buffGroup: Int = 0,
                @SerialName("ckOpIndv")
                val ckOpIndv: List<CkOpIndv> = listOf(),
                @SerialName("ckSelfIndv")
                val ckSelfIndv: List<CkSelfIndv> = listOf(),
                @SerialName("detail")
                val detail: String = "",
                @SerialName("icon")
                val icon: String = "",
                @SerialName("id")
                val id: Int = 0,
                @SerialName("maxRate")
                val maxRate: Int = 0,
                @SerialName("name")
                val name: String = "",
                @SerialName("originalName")
                val originalName: String = "",
                @SerialName("originalScript")
                val originalScript: OriginalScript? = null,
                @SerialName("script")
                val script: Script? = null,
                @SerialName("tvals")
                val tvals: List<Tval> = listOf(),
                @SerialName("type")
                val type: String = "",
                @SerialName("vals")
                val vals: List<Val> = listOf()
            ) {
                @Serializable
                data class CkOpIndv(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class CkSelfIndv(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class OriginalScript(
                    @SerialName("AppId")
                    val appId: Int? = null,
                    @SerialName("checkIndvType")
                    val checkIndvType: Int? = null,
                    @SerialName("CounterMessage")
                    val counterMessage: String? = null,
                    @SerialName("DamageRelease")
                    val damageRelease: Int? = null,
                    @SerialName("ProgressSelfTurn")
                    val progressSelfTurn: Int? = null,
                    @SerialName("relationId")
                    val relationId: Int? = null,
                    @SerialName("relationOverwrite")
                    val relationOverwrite: List<RelationOverwrite>? = null,
                    @SerialName("ReleaseText")
                    val releaseText: String? = null
                ) {
                    @Serializable
                    data class RelationOverwrite(
                        @SerialName("atkClass")
                        val atkClass: Int = 0,
                        @SerialName("atkSide")
                        val atkSide: Int = 0,
                        @SerialName("damageRate")
                        val damageRate: Int = 0,
                        @SerialName("defClass")
                        val defClass: Int = 0,
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("type")
                        val type: Int = 0
                    )
                }

                @Serializable
                data class Script(
                    @SerialName("AppId")
                    val appId: Int? = null,
                    @SerialName("checkIndvType")
                    val checkIndvType: Int? = null,
                    @SerialName("CounterMessage")
                    val counterMessage: String? = null,
                    @SerialName("DamageRelease")
                    val damageRelease: Int? = null,
                    @SerialName("ProgressSelfTurn")
                    val progressSelfTurn: Int? = null,
                    @SerialName("relationId")
                    val relationId: RelationId? = null,
                    @SerialName("ReleaseText")
                    val releaseText: String? = null
                ) {
                    @Serializable
                    data class RelationId(
                        @SerialName("atkSide")
                        val atkSide: AtkSide? = null,
                        @SerialName("defSide")
                        val defSide: DefSide = DefSide()
                    ) {
                        @Serializable
                        class AtkSide

                        @Serializable
                        data class DefSide(
                            @SerialName("alterEgo")
                            val alterEgo: AlterEgo = AlterEgo(),
                            @SerialName("archer")
                            val archer: Archer = Archer(),
                            @SerialName("assassin")
                            val assassin: Assassin = Assassin(),
                            @SerialName("avenger")
                            val avenger: Avenger = Avenger(),
                            @SerialName("beastI")
                            val beastI: BeastI = BeastI(),
                            @SerialName("beastIV")
                            val beastIV: BeastIV = BeastIV(),
                            @SerialName("beastUnknown")
                            val beastUnknown: BeastUnknown = BeastUnknown(),
                            @SerialName("berserker")
                            val berserker: Berserker = Berserker(),
                            @SerialName("caster")
                            val caster: Caster = Caster(),
                            @SerialName("demonGodPillar")
                            val demonGodPillar: DemonGodPillar = DemonGodPillar(),
                            @SerialName("foreigner")
                            val foreigner: Foreigner = Foreigner(),
                            @SerialName("lancer")
                            val lancer: Lancer = Lancer(),
                            @SerialName("moonCancer")
                            val moonCancer: MoonCancer = MoonCancer(),
                            @SerialName("pretender")
                            val pretender: Pretender = Pretender(),
                            @SerialName("rider")
                            val rider: Rider = Rider(),
                            @SerialName("ruler")
                            val ruler: Ruler = Ruler(),
                            @SerialName("saber")
                            val saber: Saber = Saber(),
                            @SerialName("shielder")
                            val shielder: Shielder = Shielder()
                        ) {
                            @Serializable
                            data class AlterEgo(
                                @SerialName("assassin")
                                val assassin: Assassin = Assassin(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster(),
                                @SerialName("foreigner")
                                val foreigner: Foreigner = Foreigner(),
                                @SerialName("rider")
                                val rider: Rider = Rider(),
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler()
                            ) {
                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Foreigner(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Rider(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Archer(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo = AlterEgo(),
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("assassin")
                                val assassin: Assassin = Assassin(),
                                @SerialName("avenger")
                                val avenger: Avenger = Avenger(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster(),
                                @SerialName("foreigner")
                                val foreigner: Foreigner = Foreigner(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("moonCancer")
                                val moonCancer: MoonCancer = MoonCancer(),
                                @SerialName("pretender")
                                val pretender: Pretender = Pretender(),
                                @SerialName("rider")
                                val rider: Rider = Rider(),
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler(),
                                @SerialName("saber")
                                val saber: Saber = Saber()
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Avenger(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Foreigner(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class MoonCancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Pretender(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Rider(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Assassin(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo = AlterEgo(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("rider")
                                val rider: Rider = Rider()
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Rider(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Avenger(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class BeastI(
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("saber")
                                val saber: Saber = Saber()
                            ) {
                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class BeastIV(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo = AlterEgo(),
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("assassin")
                                val assassin: Assassin = Assassin(),
                                @SerialName("avenger")
                                val avenger: Avenger = Avenger(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster(),
                                @SerialName("foreigner")
                                val foreigner: Foreigner = Foreigner(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("moonCancer")
                                val moonCancer: MoonCancer = MoonCancer(),
                                @SerialName("pretender")
                                val pretender: Pretender = Pretender(),
                                @SerialName("rider")
                                val rider: Rider = Rider(),
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler(),
                                @SerialName("saber")
                                val saber: Saber = Saber(),
                                @SerialName("shielder")
                                val shielder: Shielder = Shielder()
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Avenger(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Foreigner(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class MoonCancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Pretender(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Rider(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Shielder(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class BeastUnknown(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo = AlterEgo(),
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("assassin")
                                val assassin: Assassin = Assassin(),
                                @SerialName("avenger")
                                val avenger: Avenger = Avenger(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster(),
                                @SerialName("foreigner")
                                val foreigner: Foreigner = Foreigner(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("moonCancer")
                                val moonCancer: MoonCancer = MoonCancer(),
                                @SerialName("pretender")
                                val pretender: Pretender = Pretender(),
                                @SerialName("rider")
                                val rider: Rider = Rider(),
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler(),
                                @SerialName("saber")
                                val saber: Saber = Saber(),
                                @SerialName("shielder")
                                val shielder: Shielder = Shielder()
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Avenger(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Foreigner(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class MoonCancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Pretender(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Rider(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Shielder(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Berserker(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo = AlterEgo(),
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("assassin")
                                val assassin: Assassin = Assassin(),
                                @SerialName("avenger")
                                val avenger: Avenger = Avenger(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("moonCancer")
                                val moonCancer: MoonCancer = MoonCancer(),
                                @SerialName("pretender")
                                val pretender: Pretender = Pretender(),
                                @SerialName("rider")
                                val rider: Rider = Rider(),
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler(),
                                @SerialName("saber")
                                val saber: Saber = Saber()
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Avenger(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class MoonCancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Pretender(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Rider(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Caster(
                                @SerialName("assassin")
                                val assassin: Assassin = Assassin(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker()
                            ) {
                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class DemonGodPillar(
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("saber")
                                val saber: Saber = Saber()
                            ) {
                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Foreigner(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("foreigner")
                                val foreigner: Foreigner = Foreigner(),
                                @SerialName("pretender")
                                val pretender: Pretender = Pretender()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Foreigner(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Pretender(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Lancer(
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker()
                            ) {
                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class MoonCancer(
                                @SerialName("avenger")
                                val avenger: Avenger = Avenger(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker()
                            ) {
                                @Serializable
                                data class Avenger(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Pretender(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo = AlterEgo(),
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("saber")
                                val saber: Saber = Saber()
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Rider(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Ruler(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("moonCancer")
                                val moonCancer: MoonCancer = MoonCancer()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class MoonCancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Saber(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo = AlterEgo(),
                                @SerialName("archer")
                                val archer: Archer = Archer(),
                                @SerialName("assassin")
                                val assassin: Assassin = Assassin(),
                                @SerialName("avenger")
                                val avenger: Avenger = Avenger(),
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster(),
                                @SerialName("lancer")
                                val lancer: Lancer = Lancer(),
                                @SerialName("moonCancer")
                                val moonCancer: MoonCancer = MoonCancer(),
                                @SerialName("pretender")
                                val pretender: Pretender = Pretender(),
                                @SerialName("rider")
                                val rider: Rider = Rider(),
                                @SerialName("ruler")
                                val ruler: Ruler = Ruler(),
                                @SerialName("saber")
                                val saber: Saber = Saber()
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Archer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Avenger(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Lancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class MoonCancer(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Pretender(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Rider(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Ruler(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Saber(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Shielder(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }
                        }
                    }
                }

                @Serializable
                data class Tval(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class Val(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )
            }

            @Serializable
            data class FuncquestTval(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )

            @Serializable
            data class Functval(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = "",
                @SerialName("negative")
                val negative: Boolean? = null
            )

            @Serializable
            class Script

            @Serializable
            data class Sval(
                @SerialName("ActSet")
                val actSet: Int? = null,
                @SerialName("ActSetWeight")
                val actSetWeight: Int? = null,
                @SerialName("AddIndividualty")
                val addIndividualty: Int? = null,
                @SerialName("AddLinkageTargetIndividualty")
                val addLinkageTargetIndividualty: Int? = null,
                @SerialName("CheckDead")
                val checkDead: Int? = null,
                @SerialName("Correction")
                val correction: Int? = null,
                @SerialName("Count")
                val count: Int? = null,
                @SerialName("CounterId")
                val counterId: Int? = null,
                @SerialName("CounterLv")
                val counterLv: Int? = null,
                @SerialName("CounterOc")
                val counterOc: Int? = null,
                @SerialName("DisplayLastFuncInvalidType")
                val displayLastFuncInvalidType: Int? = null,
                @SerialName("HideMiss")
                val hideMiss: Int? = null,
                @SerialName("HideNoEffect")
                val hideNoEffect: Int? = null,
                @SerialName("IncludeIgnoreIndividuality")
                val includeIgnoreIndividuality: Int? = null,
                @SerialName("ParamAddMaxCount")
                val paramAddMaxCount: Int? = null,
                @SerialName("Rate")
                val rate: Int? = null,
                @SerialName("RatioHPLow")
                val ratioHPLow: Int? = null,
                @SerialName("ShowQuestNoEffect")
                val showQuestNoEffect: Int? = null,
                @SerialName("ShowState")
                val showState: Int? = null,
                @SerialName("SkillReaction")
                val skillReaction: Int? = null,
                @SerialName("Target")
                val target: Int? = null,
                @SerialName("TargetIndiv")
                val targetIndiv: Int? = null,
                @SerialName("TargetList")
                val targetList: List<Int>? = null,
                @SerialName("TargetRarityList")
                val targetRarityList: List<Int>? = null,
                @SerialName("TriggeredFuncPosition")
                val triggeredFuncPosition: Int? = null,
                @SerialName("Turn")
                val turn: Int? = null,
                @SerialName("UseRate")
                val useRate: Int? = null,
                @SerialName("UseTreasureDevice")
                val useTreasureDevice: Int? = null,
                @SerialName("Value")
                val value: Int? = null,
                @SerialName("Value2")
                val value2: Int? = null
            )

            @Serializable
            data class Svals2(
                @SerialName("ActSet")
                val actSet: Int? = null,
                @SerialName("ActSetWeight")
                val actSetWeight: Int? = null,
                @SerialName("AddIndividualty")
                val addIndividualty: Int? = null,
                @SerialName("AddLinkageTargetIndividualty")
                val addLinkageTargetIndividualty: Int? = null,
                @SerialName("CheckDead")
                val checkDead: Int? = null,
                @SerialName("Correction")
                val correction: Int? = null,
                @SerialName("Count")
                val count: Int? = null,
                @SerialName("CounterId")
                val counterId: Int? = null,
                @SerialName("CounterLv")
                val counterLv: Int? = null,
                @SerialName("CounterOc")
                val counterOc: Int? = null,
                @SerialName("DisplayLastFuncInvalidType")
                val displayLastFuncInvalidType: Int? = null,
                @SerialName("HideMiss")
                val hideMiss: Int? = null,
                @SerialName("HideNoEffect")
                val hideNoEffect: Int? = null,
                @SerialName("IncludeIgnoreIndividuality")
                val includeIgnoreIndividuality: Int? = null,
                @SerialName("ParamAddMaxCount")
                val paramAddMaxCount: Int? = null,
                @SerialName("Rate")
                val rate: Int? = null,
                @SerialName("RatioHPLow")
                val ratioHPLow: Int? = null,
                @SerialName("ShowQuestNoEffect")
                val showQuestNoEffect: Int? = null,
                @SerialName("ShowState")
                val showState: Int? = null,
                @SerialName("SkillReaction")
                val skillReaction: Int? = null,
                @SerialName("Target")
                val target: Int? = null,
                @SerialName("TargetIndiv")
                val targetIndiv: Int? = null,
                @SerialName("TargetList")
                val targetList: List<Int>? = null,
                @SerialName("TargetRarityList")
                val targetRarityList: List<Int>? = null,
                @SerialName("TriggeredFuncPosition")
                val triggeredFuncPosition: Int? = null,
                @SerialName("Turn")
                val turn: Int? = null,
                @SerialName("UseRate")
                val useRate: Int? = null,
                @SerialName("UseTreasureDevice")
                val useTreasureDevice: Int? = null,
                @SerialName("Value")
                val value: Int? = null,
                @SerialName("Value2")
                val value2: Int? = null
            )

            @Serializable
            data class Svals3(
                @SerialName("ActSet")
                val actSet: Int? = null,
                @SerialName("ActSetWeight")
                val actSetWeight: Int? = null,
                @SerialName("AddIndividualty")
                val addIndividualty: Int? = null,
                @SerialName("AddLinkageTargetIndividualty")
                val addLinkageTargetIndividualty: Int? = null,
                @SerialName("CheckDead")
                val checkDead: Int? = null,
                @SerialName("Correction")
                val correction: Int? = null,
                @SerialName("Count")
                val count: Int? = null,
                @SerialName("CounterId")
                val counterId: Int? = null,
                @SerialName("CounterLv")
                val counterLv: Int? = null,
                @SerialName("CounterOc")
                val counterOc: Int? = null,
                @SerialName("DisplayLastFuncInvalidType")
                val displayLastFuncInvalidType: Int? = null,
                @SerialName("HideMiss")
                val hideMiss: Int? = null,
                @SerialName("HideNoEffect")
                val hideNoEffect: Int? = null,
                @SerialName("IncludeIgnoreIndividuality")
                val includeIgnoreIndividuality: Int? = null,
                @SerialName("ParamAddMaxCount")
                val paramAddMaxCount: Int? = null,
                @SerialName("Rate")
                val rate: Int? = null,
                @SerialName("RatioHPLow")
                val ratioHPLow: Int? = null,
                @SerialName("ShowQuestNoEffect")
                val showQuestNoEffect: Int? = null,
                @SerialName("ShowState")
                val showState: Int? = null,
                @SerialName("SkillReaction")
                val skillReaction: Int? = null,
                @SerialName("Target")
                val target: Int? = null,
                @SerialName("TargetIndiv")
                val targetIndiv: Int? = null,
                @SerialName("TargetList")
                val targetList: List<Int>? = null,
                @SerialName("TargetRarityList")
                val targetRarityList: List<Int>? = null,
                @SerialName("TriggeredFuncPosition")
                val triggeredFuncPosition: Int? = null,
                @SerialName("Turn")
                val turn: Int? = null,
                @SerialName("UseRate")
                val useRate: Int? = null,
                @SerialName("UseTreasureDevice")
                val useTreasureDevice: Int? = null,
                @SerialName("Value")
                val value: Int? = null,
                @SerialName("Value2")
                val value2: Int? = null
            )

            @Serializable
            data class Svals4(
                @SerialName("ActSet")
                val actSet: Int? = null,
                @SerialName("ActSetWeight")
                val actSetWeight: Int? = null,
                @SerialName("AddIndividualty")
                val addIndividualty: Int? = null,
                @SerialName("AddLinkageTargetIndividualty")
                val addLinkageTargetIndividualty: Int? = null,
                @SerialName("CheckDead")
                val checkDead: Int? = null,
                @SerialName("Correction")
                val correction: Int? = null,
                @SerialName("Count")
                val count: Int? = null,
                @SerialName("CounterId")
                val counterId: Int? = null,
                @SerialName("CounterLv")
                val counterLv: Int? = null,
                @SerialName("CounterOc")
                val counterOc: Int? = null,
                @SerialName("DisplayLastFuncInvalidType")
                val displayLastFuncInvalidType: Int? = null,
                @SerialName("HideMiss")
                val hideMiss: Int? = null,
                @SerialName("HideNoEffect")
                val hideNoEffect: Int? = null,
                @SerialName("IncludeIgnoreIndividuality")
                val includeIgnoreIndividuality: Int? = null,
                @SerialName("ParamAddMaxCount")
                val paramAddMaxCount: Int? = null,
                @SerialName("Rate")
                val rate: Int? = null,
                @SerialName("RatioHPLow")
                val ratioHPLow: Int? = null,
                @SerialName("ShowQuestNoEffect")
                val showQuestNoEffect: Int? = null,
                @SerialName("ShowState")
                val showState: Int? = null,
                @SerialName("SkillReaction")
                val skillReaction: Int? = null,
                @SerialName("Target")
                val target: Int? = null,
                @SerialName("TargetIndiv")
                val targetIndiv: Int? = null,
                @SerialName("TargetList")
                val targetList: List<Int>? = null,
                @SerialName("TargetRarityList")
                val targetRarityList: List<Int>? = null,
                @SerialName("TriggeredFuncPosition")
                val triggeredFuncPosition: Int? = null,
                @SerialName("Turn")
                val turn: Int? = null,
                @SerialName("UseRate")
                val useRate: Int? = null,
                @SerialName("UseTreasureDevice")
                val useTreasureDevice: Int? = null,
                @SerialName("Value")
                val value: Int? = null,
                @SerialName("Value2")
                val value2: Int? = null
            )

            @Serializable
            data class Svals5(
                @SerialName("ActSet")
                val actSet: Int? = null,
                @SerialName("ActSetWeight")
                val actSetWeight: Int? = null,
                @SerialName("AddIndividualty")
                val addIndividualty: Int? = null,
                @SerialName("AddLinkageTargetIndividualty")
                val addLinkageTargetIndividualty: Int? = null,
                @SerialName("CheckDead")
                val checkDead: Int? = null,
                @SerialName("Correction")
                val correction: Int? = null,
                @SerialName("Count")
                val count: Int? = null,
                @SerialName("CounterId")
                val counterId: Int? = null,
                @SerialName("CounterLv")
                val counterLv: Int? = null,
                @SerialName("CounterOc")
                val counterOc: Int? = null,
                @SerialName("DisplayLastFuncInvalidType")
                val displayLastFuncInvalidType: Int? = null,
                @SerialName("HideMiss")
                val hideMiss: Int? = null,
                @SerialName("HideNoEffect")
                val hideNoEffect: Int? = null,
                @SerialName("IncludeIgnoreIndividuality")
                val includeIgnoreIndividuality: Int? = null,
                @SerialName("ParamAddMaxCount")
                val paramAddMaxCount: Int? = null,
                @SerialName("Rate")
                val rate: Int? = null,
                @SerialName("RatioHPLow")
                val ratioHPLow: Int? = null,
                @SerialName("ShowQuestNoEffect")
                val showQuestNoEffect: Int? = null,
                @SerialName("ShowState")
                val showState: Int? = null,
                @SerialName("SkillReaction")
                val skillReaction: Int? = null,
                @SerialName("Target")
                val target: Int? = null,
                @SerialName("TargetIndiv")
                val targetIndiv: Int? = null,
                @SerialName("TargetList")
                val targetList: List<Int>? = null,
                @SerialName("TargetRarityList")
                val targetRarityList: List<Int>? = null,
                @SerialName("TriggeredFuncPosition")
                val triggeredFuncPosition: Int? = null,
                @SerialName("Turn")
                val turn: Int? = null,
                @SerialName("UseRate")
                val useRate: Int? = null,
                @SerialName("UseTreasureDevice")
                val useTreasureDevice: Int? = null,
                @SerialName("Value")
                val value: Int? = null,
                @SerialName("Value2")
                val value2: Int? = null
            )

            @Serializable
            data class TraitVal(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )
        }

        @Serializable
        data class Individuality(
            @SerialName("id")
            val id: Int = 0,
            @SerialName("name")
            val name: String = ""
        )

        @Serializable
        data class NpGain(
            @SerialName("arts")
            val arts: List<Int> = listOf(),
            @SerialName("buster")
            val buster: List<Int> = listOf(),
            @SerialName("defence")
            val defence: List<Int> = listOf(),
            @SerialName("extra")
            val extra: List<Int> = listOf(),
            @SerialName("np")
            val np: List<Int> = listOf(),
            @SerialName("quick")
            val quick: List<Int> = listOf()
        )

        @Serializable
        data class NpSvt(
            @SerialName("card")
            val card: String = "",
            @SerialName("condFriendshipRank")
            val condFriendshipRank: Int = 0,
            @SerialName("condLv")
            val condLv: Int = 0,
            @SerialName("condQuestId")
            val condQuestId: Int = 0,
            @SerialName("condQuestPhase")
            val condQuestPhase: Int = 0,
            @SerialName("damage")
            val damage: List<Int> = listOf(),
            @SerialName("flag")
            val flag: Int = 0,
            @SerialName("imageIndex")
            val imageIndex: Int = 0,
            @SerialName("motion")
            val motion: Int = 0,
            @SerialName("npNum")
            val npNum: Int = 0,
            @SerialName("num")
            val num: Int = 0,
            @SerialName("priority")
            val priority: Int = 0,
            @SerialName("releaseConditions")
            val releaseConditions: List<ReleaseCondition> = listOf(),
            @SerialName("strengthStatus")
            val strengthStatus: Int = 0,
            @SerialName("svtId")
            val svtId: Int = 0
        ) {
            @Serializable
            data class ReleaseCondition(
                @SerialName("condGroup")
                val condGroup: Int = 0,
                @SerialName("condNum")
                val condNum: Int = 0,
                @SerialName("condTargetId")
                val condTargetId: Int = 0,
                @SerialName("condType")
                val condType: String = "",
                @SerialName("idx")
                val idx: Int = 0
            )
        }

        @Serializable
        data class ReleaseCondition(
            @SerialName("condGroup")
            val condGroup: Int = 0,
            @SerialName("condNum")
            val condNum: Int = 0,
            @SerialName("condTargetId")
            val condTargetId: Int = 0,
            @SerialName("condType")
            val condType: String = "",
            @SerialName("idx")
            val idx: Int = 0
        )

        @Serializable
        data class Script(
            @SerialName("excludeTdChangeTypes")
            val excludeTdChangeTypes: List<Int>? = null,
            @SerialName("STAR_HIGHER")
            val sTARHIGHER: List<Int>? = null,
            @SerialName("tdTypeChangeIDs")
            val tdTypeChangeIDs: List<Int>? = null
        )
    }

    @Serializable
    data class SkillMaterials(
        @SerialName("1")
        val x1: X1? = null,
        @SerialName("2")
        val x2: X2? = null,
        @SerialName("3")
        val x3: X3? = null,
        @SerialName("4")
        val x4: X4? = null,
        @SerialName("5")
        val x5: X5? = null,
        @SerialName("6")
        val x6: X6? = null,
        @SerialName("7")
        val x7: X7? = null,
        @SerialName("8")
        val x8: X8? = null,
        @SerialName("9")
        val x9: X9? = null
    ) {
        @Serializable
        data class X1(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X2(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X3(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X4(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X5(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X6(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X7(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X8(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("individuality")
                    val individuality: List<Individuality> = listOf(),

                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                ) {
                    @Serializable
                    data class Individuality(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }
            }
        }

        @Serializable
        data class X9(
            @SerialName("items")
            val items: List<Item> = listOf(),
            @SerialName("qp")
            val qp: Int = 0
        ) {
            @Serializable
            data class Item(
                @SerialName("amount")
                val amount: Int = 0,
                @SerialName("item")
                val item: Item = Item()
            ) {
                @Serializable
                data class Item(
                    @SerialName("background")
                    val background: String = "",
                    @SerialName("detail")
                    val detail: String = "",
                    @SerialName("dropPriority")
                    val dropPriority: Int = 0,
                    @SerialName("endedAt")
                    val endedAt: Int = 0,
                    @SerialName("icon")
                    val icon: String = "",
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = "",
                    @SerialName("originalName")
                    val originalName: String = "",
                    @SerialName("priority")
                    val priority: Int = 0,
                    @SerialName("startedAt")
                    val startedAt: Int = 0,
                    @SerialName("type")
                    val type: String = "",
                    @SerialName("uses")
                    val uses: List<String> = listOf(),
                    @SerialName("value")
                    val value: Int = 0
                )
            }
        }
    }

    @Serializable
    data class Skill(
        @SerialName("coolDown")
        val coolDown: List<Int> = listOf(),
        @SerialName("detail")
        val detail: String = "",
        @SerialName("functions")
        val functions: List<Function> = listOf(),
        @SerialName("icon")
        val icon: String = "",
        @SerialName("id")
        val id: Int = 0,
        @SerialName("name")
        val name: String = "",
        @SerialName("num")
        val num: Int = 0,
        @SerialName("originalName")
        val originalName: String = "",
        @SerialName("priority")
        val priority: Int = 0,
        @SerialName("ruby")
        val ruby: String = "",
        @SerialName("strengthStatus")
        val strengthStatus: Int = 0,
        @SerialName("svtId")
        val svtId: Int = 0,
        @SerialName("type")
        val type: String = "",
        @SerialName("unmodifiedDetail")
        val unmodifiedDetail: String = ""
    ) {

        @Serializable
        data class Function(
            @SerialName("buffs")
            val buffs: List<Buff> = listOf(),

            @SerialName("funcId")
            val funcId: Int = 0,
            @SerialName("funcPopupIcon")
            val funcPopupIcon: String? = null,
            @SerialName("funcPopupText")
            val funcPopupText: String = "",
            @SerialName("funcTargetTeam")
            val funcTargetTeam: String = "",
            @SerialName("funcTargetType")
            val funcTargetType: String = "",
            @SerialName("funcType")
            val funcType: String = "",
            @SerialName("funcquestTvals")
            val funcquestTvals: List<FuncquestTval> = listOf(),
            @SerialName("functvals")
            val functvals: List<Functval> = listOf(),
            @SerialName("script")
            val script: Script? = null,
            @SerialName("svals")
            val svals: List<Sval> = listOf(),
            @SerialName("traitVals")
            val traitVals: List<TraitVal>? = null
        ) {
            @Serializable
            data class Buff(
                @SerialName("buffGroup")
                val buffGroup: Int = 0,
                @SerialName("ckOpIndv")
                val ckOpIndv: List<CkOpIndv> = listOf(),
                @SerialName("ckSelfIndv")
                val ckSelfIndv: List<CkSelfIndv> = listOf(),
                @SerialName("detail")
                val detail: String = "",
                @SerialName("icon")
                val icon: String = "",
                @SerialName("id")
                val id: Int = 0,
                @SerialName("maxRate")
                val maxRate: Int = 0,
                @SerialName("name")
                val name: String = "",
                @SerialName("originalName")
                val originalName: String = "",
                @SerialName("originalScript")
                val originalScript: OriginalScript? = null,
                @SerialName("script")
                val script: Script? = null,
                @SerialName("tvals")
                val tvals: List<Tval> = listOf(),
                @SerialName("type")
                val type: String = "",
                @SerialName("vals")
                val vals: List<Val> = listOf()
            ) {
                @Serializable
                data class CkOpIndv(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class CkSelfIndv(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class OriginalScript(
                    @SerialName("checkIndvType")
                    val checkIndvType: Int? = null,
                    @SerialName("CheckOpponentBuffTypes")
                    val checkOpponentBuffTypes: String? = null,
                    @SerialName("DamageRelease")
                    val damageRelease: Int? = null,
                    @SerialName("HP_LOWER")
                    val hPLOWER: Int? = null,
                    @SerialName("INDIVIDUALITIE")
                    val iNDIVIDUALITIE: Int? = null,
                    @SerialName("missText")
                    val missText: String? = null,
                    @SerialName("ProgressSelfTurn")
                    val progressSelfTurn: Int? = null,
                    @SerialName("relationId")
                    val relationId: Int? = null,
                    @SerialName("relationOverwrite")
                    val relationOverwrite: List<RelationOverwrite>? = null,
                    @SerialName("ReleaseText")
                    val releaseText: String? = null,
                    @SerialName("UpBuffRateBuffIndiv")
                    val upBuffRateBuffIndiv: String? = null
                ) {
                    @Serializable
                    data class RelationOverwrite(
                        @SerialName("atkClass")
                        val atkClass: Int = 0,
                        @SerialName("atkSide")
                        val atkSide: Int = 0,
                        @SerialName("damageRate")
                        val damageRate: Int = 0,
                        @SerialName("defClass")
                        val defClass: Int = 0,
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("type")
                        val type: Int = 0
                    )
                }

                @Serializable
                data class Script(
                    @SerialName("checkIndvType")
                    val checkIndvType: Int? = null,
                    @SerialName("CheckOpponentBuffTypes")
                    val checkOpponentBuffTypes: List<String>? = null,
                    @SerialName("DamageRelease")
                    val damageRelease: Int? = null,
                    @SerialName("HP_LOWER")
                    val hPLOWER: Int? = null,
                    @SerialName("INDIVIDUALITIE")
                    val iNDIVIDUALITIE: INDIVIDUALITIE? = null,
                    @SerialName("missText")
                    val missText: String? = null,
                    @SerialName("ProgressSelfTurn")
                    val progressSelfTurn: Int? = null,
                    @SerialName("relationId")
                    val relationId: RelationId? = null,
                    @SerialName("ReleaseText")
                    val releaseText: String? = null,
                    @SerialName("UpBuffRateBuffIndiv")
                    val upBuffRateBuffIndiv: List<UpBuffRateBuffIndiv>? = null
                ) {
                    @Serializable
                    data class INDIVIDUALITIE(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )

                    @Serializable
                    data class RelationId(
                        @SerialName("atkSide")
                        val atkSide: AtkSide? = null,
                        @SerialName("defSide")
                        val defSide: DefSide = DefSide()
                    ) {
                        @Serializable
                        data class AtkSide(
                            @SerialName("assassin")
                            val assassin: Assassin? = null,
                            @SerialName("berserker")
                            val berserker: Berserker? = null,
                            @SerialName("pretender")
                            val pretender: Pretender? = null
                        ) {
                            @Serializable
                            data class Assassin(
                                @SerialName("alterEgo")
                                val alterEgo: AlterEgo? = null,
                                @SerialName("caster")
                                val caster: Caster? = null
                            ) {
                                @Serializable
                                data class AlterEgo(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Berserker(
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Pretender(
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }
                        }

                        @Serializable
                        data class DefSide(
                            @SerialName("alterEgo")
                            val alterEgo: AlterEgo? = null,
                            @SerialName("archer")
                            val archer: Archer? = null,
                            @SerialName("assassin")
                            val assassin: Assassin? = null,
                            @SerialName("berserker")
                            val berserker: Berserker? = null,
                            @SerialName("caster")
                            val caster: Caster? = null,
                            @SerialName("pretender")
                            val pretender: Pretender? = null,
                            @SerialName("rider")
                            val rider: Rider? = null,
                            @SerialName("saber")
                            val saber: Saber? = null
                        ) {
                            @Serializable
                            data class AlterEgo(
                                @SerialName("assassin")
                                val assassin: Assassin? = null,
                                @SerialName("caster")
                                val caster: Caster? = null
                            ) {
                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Archer(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Assassin(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Berserker(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Caster(
                                @SerialName("assassin")
                                val assassin: Assassin? = null,
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("pretender")
                                val pretender: Pretender? = null
                            ) {
                                @Serializable
                                data class Assassin(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Pretender(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Pretender(
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Rider(
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }

                            @Serializable
                            data class Saber(
                                @SerialName("berserker")
                                val berserker: Berserker = Berserker(),
                                @SerialName("caster")
                                val caster: Caster = Caster()
                            ) {
                                @Serializable
                                data class Berserker(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )

                                @Serializable
                                data class Caster(
                                    @SerialName("damageRate")
                                    val damageRate: Int = 0,
                                    @SerialName("type")
                                    val type: String = ""
                                )
                            }
                        }
                    }

                    @Serializable
                    data class UpBuffRateBuffIndiv(
                        @SerialName("id")
                        val id: Int = 0,
                        @SerialName("name")
                        val name: String = ""
                    )
                }

                @Serializable
                data class Tval(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )

                @Serializable
                data class Val(
                    @SerialName("id")
                    val id: Int = 0,
                    @SerialName("name")
                    val name: String = ""
                )
            }

            @Serializable
            data class FuncquestTval(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )

            @Serializable
            data class Functval(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = "",
                @SerialName("negative")
                val negative: Boolean? = null
            )

            @Serializable
            class Script

            @Serializable
            data class Sval(
                @SerialName("ActSet")
                val actSet: Int? = null,
                @SerialName("ActSetWeight")
                val actSetWeight: Int? = null,
                @SerialName("AddIndividualty")
                val addIndividualty: Int? = null,
                @SerialName("AddLinkageTargetIndividualty")
                val addLinkageTargetIndividualty: Int? = null,
                @SerialName("AuraEffectId")
                val auraEffectId: Int? = null,
                @SerialName("Count")
                val count: Int? = null,
                @SerialName("DependFuncId")
                val dependFuncId: Int? = null,
                @SerialName("DependFuncVals")
                val dependFuncVals: DependFuncVals? = null,
                @SerialName("HideMiss")
                val hideMiss: Int? = null,
                @SerialName("HideNoEffect")
                val hideNoEffect: Int? = null,
                @SerialName("IgnoreIndividuality")
                val ignoreIndividuality: Int? = null,
                @SerialName("InvalidHide")
                val invalidHide: Int? = null,
                @SerialName("MotionChange")
                val motionChange: Int? = null,
                @SerialName("MultipleGainStar")
                val multipleGainStar: Int? = null,
                @SerialName("ParamAdd")
                val paramAdd: Int? = null,
                @SerialName("ParamAddMaxCount")
                val paramAddMaxCount: Int? = null,
                @SerialName("ParamAddMaxValue")
                val paramAddMaxValue: Int? = null,
                @SerialName("ParamAddOpIndividuality")
                val paramAddOpIndividuality: List<Int>? = null,
                @SerialName("ParamAddValue")
                val paramAddValue: Int? = null,
                @SerialName("ParamMax")
                val paramMax: Int? = null,
                @SerialName("Rate")
                val rate: Int = 0,
                @SerialName("RatioHPHigh")
                val ratioHPHigh: Int? = null,
                @SerialName("RatioHPLow")
                val ratioHPLow: Int? = null,
                @SerialName("RatioHPRangeHigh")
                val ratioHPRangeHigh: Int? = null,
                @SerialName("RatioHPRangeLow")
                val ratioHPRangeLow: Int? = null,
                @SerialName("SetLimitCount")
                val setLimitCount: Int? = null,
                @SerialName("SetPassiveFrame")
                val setPassiveFrame: Int? = null,
                @SerialName("ShowCardOnly")
                val showCardOnly: Int? = null,
                @SerialName("ShowQuestNoEffect")
                val showQuestNoEffect: Int? = null,
                @SerialName("ShowState")
                val showState: Int? = null,
                @SerialName("SkillID")
                val skillID: Int? = null,
                @SerialName("SkillLV")
                val skillLV: Int? = null,
                @SerialName("StarHigher")
                val starHigher: Int? = null,
                @SerialName("Target")
                val target: Int? = null,
                @SerialName("Turn")
                val turn: Int? = null,
                @SerialName("UnSubStateWhileLinkedToOthers")
                val unSubStateWhileLinkedToOthers: Int? = null,
                @SerialName("UseRate")
                val useRate: Int? = null,
                @SerialName("Value")
                val value: Int? = null,
                @SerialName("Value2")
                val value2: Int? = null
            ) {
                @Serializable
                data class DependFuncVals(
                    @SerialName("Rate")
                    val rate: Int = 0,
                    @SerialName("Value")
                    val value: Int? = null,
                    @SerialName("Value2")
                    val value2: Int? = null
                )
            }

            @Serializable
            data class TraitVal(
                @SerialName("id")
                val id: Int = 0,
                @SerialName("name")
                val name: String = ""
            )
        }

    }

    @Serializable
    data class Trait(
        @SerialName("id")
        val id: Int = 0,
        @SerialName("name")
        val name: String = ""
    )
}