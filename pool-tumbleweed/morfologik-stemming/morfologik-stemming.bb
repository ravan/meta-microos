SUMMARY = "Morfologik stemming library"
DESCRIPTION = "Morfologik provides high quality lemmatisation for the Polish language, \
along with tools for building and using byte-based finite state automata."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-2.1.9-4.5.noarch.rpm"
RPM_HASH = "87218b0883599327595a9bf97e56606acd13aeeb1d9c3762a30b6f5144fd6566a74e0d74c0abfee4481163fb0021389b068afacce3c862be72c4838043b089f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "morfologik-stemming \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-fsa-builders \
mvn-org.carrot2-morfologik-fsa-builders-pom- \
mvn-org.carrot2-morfologik-fsa-pom- \
mvn-org.carrot2-morfologik-parent-pom- \
mvn-org.carrot2-morfologik-polish \
mvn-org.carrot2-morfologik-polish-pom- \
mvn-org.carrot2-morfologik-speller \
mvn-org.carrot2-morfologik-speller-pom- \
mvn-org.carrot2-morfologik-stemming \
mvn-org.carrot2-morfologik-stemming-pom- \
mvn-org.carrot2-morfologik-tools \
mvn-org.carrot2-morfologik-tools-pom- \
osgi-org.carrot2.morfologik-fsa \
osgi-org.carrot2.morfologik-fsa-builders \
osgi-org.carrot2.morfologik-polish \
osgi-org.carrot2.morfologik-speller \
osgi-org.carrot2.morfologik-stemming"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.beust-jcommander \
mvn-com.carrotsearch-hppc"

inherit rpm
