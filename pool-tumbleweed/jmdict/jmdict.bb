SUMMARY = "The Japanese Dictionary from the EDRDG project (JMdict format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the XML variant of: \
 \
* the JMdict project's word dictionary ('JMdict' file) \
* the KANJIDIC project's Kanji dictionary (covering JIS 0208/0212/0213; \
  'kanjidic2.xml' file)"
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20260325"

RPM_NAME = "jmdict-20260325-1.2.noarch.rpm"
RPM_HASH = "4f7a8575041edc2ba04d77136e6d687dd131ee7f9df53eeb92946295e1ee58e88a4fd376f58a8c8f08e0cdb8cdba1c222dc52a5502e3bdd60ff3c603ef975434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdict"

RDEPENDS:${PN} += ""

inherit rpm
