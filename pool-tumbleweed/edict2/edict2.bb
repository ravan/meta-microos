SUMMARY = "The Japanese Dictionary from the EDRDG project (edict2 format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the 'edict2' variant, an expanded version of the flat \
'edict' text format but reflecting the structure of the XML entries, \
of the JMdict word dictionary."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20260325"

RPM_NAME = "edict2-20260325-1.2.noarch.rpm"
RPM_HASH = "aed020ff71743912cd3e36ae9f1ca3f3c697d31107f46c8d15deb4651fada09c51a6383708c368cc2e85138c1fbc2db48d85a2b1cd1ce454161ba0014d3eb757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict2"

RDEPENDS:${PN} += ""

inherit rpm
