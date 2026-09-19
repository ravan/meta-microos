SUMMARY = "The Japanese Dictionary from the EDRDG project (EDICT-EUCJP format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the 'edict'/EUC-JP variant."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20260325"

RPM_NAME = "edict-eucjp-20260325-1.2.noarch.rpm"
RPM_HASH = "c95fe766b0d47d77876441b40ffedabc0ec4c9f056cf5f7e6e67085240c57ea26940fede202837cbec48ac8960aa0724ea81c0f6c93362147535055cee1746db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict-eucjp"

RDEPENDS:${PN} += ""

inherit rpm
