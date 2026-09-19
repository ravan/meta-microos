SUMMARY = "The Japanese Dictionary from the EDRDG project (EDICT format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the 'edict'/UTF8 variant, a flat text file format, of: \
 \
* the JMdict project's word dictionary ('edict' file) \
* the KANJIDIC project's JIS X 0208-1990 Kanji dictionary (6355 Kanji) \
* KANJIDIC's JIS X 0212-1990 dictionary (an extra 5801 Kanji) \
* KANJIDIC's JIS X 0213-2012 dictionary (an extra 952 Kanji) \
* kanji-to-radical and radical-to-kanji indices \
* ENAMDICT, a dictionary for proper names \
 \
Other formats are in the edict2 and jmdict packages."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20260325"

RPM_NAME = "edict-20260325-1.2.noarch.rpm"
RPM_HASH = "a9f620b1d564ac4d16b8bc63084645f66508e8d2e83d3c47d594c5fa258f9713b628e9f940c8c4f60b888a442193ad90740bda5f320b35bd76547bb75a5bdc49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict"

RDEPENDS:${PN} += ""

inherit rpm
