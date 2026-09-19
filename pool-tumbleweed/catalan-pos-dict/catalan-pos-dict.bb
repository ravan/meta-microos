SUMMARY = "German part-of-speech dictionary"
DESCRIPTION = "A Catalan part-of-speech (POS) dictionary as a Morfologik binary"
LICENSE = "GPL-2.0-only | LGPL-2.1-only"

PV = "2.7+git6dc3553"

RPM_NAME = "catalan-pos-dict-2.7+git6dc3553-3.6.noarch.rpm"
RPM_HASH = "60c0e3a0bb946e5d7e198c6ddabfc4b8cba6d924db82fcedcc12508d52e6c83194552b81f761b622a49d87c1ebafdd98fda1cb7bbb48514786ff52068a54aed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catalan-pos-dict \
mvn-org.softcatala-catalan-pos-dict \
mvn-org.softcatala-catalan-pos-dict-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-stemming"

inherit rpm
