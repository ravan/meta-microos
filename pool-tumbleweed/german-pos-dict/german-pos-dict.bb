SUMMARY = "German part-of-speech dictionary"
DESCRIPTION = "A German part-of-speech (POS) dictionary as a Morfologik binary"
LICENSE = "CC-BY-SA-4.0"

PV = "1.1"

RPM_NAME = "german-pos-dict-1.1-1.27.noarch.rpm"
RPM_HASH = "05442e260e408c651ebd8d2f0b84ba375d680bc2d1f5d57138b415506fbde04bea17cc030b84858dc4a8bfde3cda11e0ca748e2b0d38a6149f6062df795e64ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "german-pos-dict \
mvn-de.danielnaber-german-pos-dict \
mvn-de.danielnaber-german-pos-dict-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-stemming"

inherit rpm
