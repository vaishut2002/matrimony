package com.sunbeam.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Nationalities {
    AFGHAN("Afghan"),
    ALBANIAN("Albanian"),
    ALGERIAN("Algerian"),
    AMERICAN("American"),
    ANDORRAN("Andorran"),
    ANGOLAN("Angolan"),
    ANTIGUAN("Antiguan"),
    ARGENTINE("Argentine"),
    ARMENIAN("Armenian"),
    AUSTRALIAN("Australian"),
    AUSTRIAN("Austrian"),
    AZERBAIJANI("Azerbaijani"),
    BAHAMIAN("Bahamian"),
    BAHRAINI("Bahraini"),
    BANGLADESHI("Bangladeshi"),
    BARBADIAN("Barbadian"),
    BELARUSIAN("Belarusian"),
    BELGIAN("Belgian"),
    BELIZEAN("Belizean"),
    BENINESE("Beninese"),
    BHUTANESE("Bhutanese"),
    BOLIVIAN("Bolivian"),
    BOSNIAN("Bosnian"),
    BOTSWANAN("Botswanan"),
    BRAZILIAN("Brazilian"),
    BRITISH("British"),
    BRUNEIAN("Bruneian"),
    BULGARIAN("Bulgarian"),
    BURKINABE("Burkinabe"),
    BURMESE("Burmese"),
    BURUNDIAN("Burundian"),
    CAMBODIAN("Cambodian"),
    CAMEROONIAN("Cameroonian"),
    CANADIAN("Canadian"),
    CAPE_VERDEAN("Cape Verdean"),
    CENTRAL_AFRICAN("Central African"),
    CHADIAN("Chadian"),
    CHILEAN("Chilean"),
    CHINESE("Chinese"),
    COLOMBIAN("Colombian"),
    COMORAN("Comoran"),
    CONGOLESE("Congolese"),
    COSTA_RICAN("Costa Rican"),
    CROATIAN("Croatian"),
    CUBAN("Cuban"),
    CYPRIOT("Cypriot"),
    CZECH("Czech"),
    DANISH("Danish"),
    DJIBOUTIAN("Djiboutian"),
    DOMINICAN("Dominican"),
    DUTCH("Dutch"),
    EAST_TIMORESE("East Timorese"),
    ECUADOREAN("Ecuadorean"),
    EGYPTIAN("Egyptian"),
    EMIRATI("Emirati"),
    ENGLISH("English"),
    EQUATORIAL_GUINEAN("Equatorial Guinean"),
    ERITREAN("Eritrean"),
    ESTONIAN("Estonian"),
    ETHIOPIAN("Ethiopian"),
    FIJIAN("Fijian"),
    FINNISH("Finnish"),
    FRENCH("French"),
    GABONESE("Gabonese"),
    GAMBIAN("Gambian"),
    GEORGIAN("Georgian"),
    GERMAN("German"),
    GHANAIAN("Ghanaian"),
    GREEK("Greek"),
    GRENADIAN("Grenadian"),
    GUATEMALAN("Guatemalan"),
    GUINEAN("Guinean"),
    GUINEA_BISSAUAN("Guinea-Bissauan"),
    GUYANESE("Guyanese"),
    HAITIAN("Haitian"),
    HONDURAN("Honduran"),
    HUNGARIAN("Hungarian"),
    ICELANDER("Icelander"),
    INDIAN("Indian"),
    INDONESIAN("Indonesian"),
    IRANIAN("Iranian"),
    IRAQI("Iraqi"),
    IRISH("Irish"),
    ISRAELI("Israeli"),
    ITALIAN("Italian"),
    IVORIAN("Ivorian"),
    JAMAICAN("Jamaican"),
    JAPANESE("Japanese"),
    JORDANIAN("Jordanian"),
    KAZAKHSTANI("Kazakhstani"),
    KENYAN("Kenyan"),
    KIRIBATI("Kiribati"),
    NORTH_KOREAN("North Korean"),
    SOUTH_KOREAN("South Korean"),
    KUWAITI("Kuwaiti"),
    KYRGYZ("Kyrgyz"),
    LAOTIAN("Laotian"),
    LATVIAN("Latvian"),
    LEBANESE("Lebanese"),
    LESOTHO("Lesotho"),
    LIBERIAN("Liberian"),
    LIBYAN("Libyan"),
    LIECHTENSTEINER("Liechtensteiner"),
    LITHUANIAN("Lithuanian"),
    LUXEMBOURGER("Luxembourger"),
    MACEDONIAN("Macedonian"),
    MALAGASY("Malagasy"),
    MALAWIAN("Malawian"),
    MALAYSIAN("Malaysian"),
    MALDIVIAN("Maldivian"),
    MALIEN("Malien"),
    MALTESE("Maltese"),
    MARSHALLESE("Marshallese"),
    MAURITANIAN("Mauritanian"),
    MAURITIAN("Mauritian"),
    MEXICAN("Mexican"),
    MICRONESIAN("Micronesian"),
    MOLDOVAN("Moldovan"),
    MONACAN("Monacan"),
    MONGOLIAN("Mongolian"),
    MONTENEGRIN("Montenegrin"),
    MOROCCAN("Moroccan"),
    MOSOTHO("Mosotho"),
    MOZAMBICAN("Mozambican"),
    NAMIBIAN("Namibian"),
    NAURUAN("Nauruan"),
    NEPALESE("Nepalese"),
    NEW_ZEALANDER("New Zealander"),
    NICARAGUAN("Nicaraguan"),
    NIGERIAN("Nigerian"),
    NIGERIEN("Nigerien"),
    NIUEAN("Niuean"),
    NORWEGIAN("Norwegian"),
    OMANI("Omani"),
    PAKISTANI("Pakistani"),
    PALAUAN("Palauan"),
    PANAMANIAN("Panamanian"),
    PAPUA_NEW_GUINEAN("Papua New Guinean"),
    PARAGUAYAN("Paraguayan"),
    PERUVIAN("Peruvian"),
    POLISH("Polish"),
    PORTUGUESE("Portuguese"),
    QATARI("Qatari"),
    ROMANIAN("Romanian"),
    RUSSIAN("Russian"),
    RWANDAN("Rwandan"),
    SAINT_KITTS_AND_NEVIS("Saint Kitts and Nevis"),
    SAINT_LUCIAN("Saint Lucian"),
    SAINT_VINCENTIAN("Saint Vincentian"),
    SAMOAN("Samoan"),
    SAN_MARINESE("San Marinese"),
    SAO_TOMEAN("Sao Tomean"),
    SAUDI("Saudi"),
    SCOTTISH("Scottish"),
    SENEGALESE("Senegalese"),
    SERBIAN("Serbian"),
    SEYCHELLOIS("Seychellois"),
    SIERRA_LEONEAN("Sierra Leonean"),
    SINGAPOREAN("Singaporean"),
    SLOVAK("Slovak"),
    SLOVENIAN("Slovenian"),
    SOLOMON_ISLANDER("Solomon Islander"),
    SOMALI("Somali"),
    SOUTH_AFRICAN("South African"),
    SPANISH("Spanish"),
    SRI_LANKAN("Sri Lankan"),
    SUDANESE("Sudanese"),
    SURINAMER("Surinamer"),
    SWAZI("Swazi"),
    SWEDISH("Swedish"),
    SWISS("Swiss"),
    SYRIAN("Syrian"),
    TAIWANESE("Taiwanese"),
    TAJIK("Tajik"),
    TANZANIAN("Tanzanian"),
    THAI("Thai"),
    TOGOLESE("Togolese"),
    TONGAN("Tongan"),
    TRINIDADIAN_OR_TOBAGONIAN("Trinidadian or Tobagonian"),
    TUNISIAN("Tunisian"),
    TURKISH("Turkish"),
    TURKMEN("Turkmen"),
    TUVALUAN("Tuvaluan"),
    UGANDAN("Ugandan"),
    UKRAINIAN("Ukrainian"),
    URUGUAYAN("Uruguayan"),
    UZBEK("Uzbek"),
    VANUATUAN("Vanuatuan"),
    VENEZUELAN("Venezuelan"),
    VIETNAMESE("Vietnamese"),
    YEMENI("Yemeni"),
    ZAMBIAN("Zambian"),
    ZIMBABWEAN("Zimbabwean");

    private final String value;

    Nationalities(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static Nationalities fromValue(String value) {
        for (Nationalities nationality : values()) {
            if (nationality.value.equalsIgnoreCase(value)) {
                return nationality;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
