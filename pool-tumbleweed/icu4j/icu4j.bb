SUMMARY = "International Components for Unicode for Java"
DESCRIPTION = "The International Components for Unicode (ICU) library provides robust and \
full-featured Unicode services on a wide variety of platforms. ICU supports \
the most current version of the Unicode standard, and provides support for \
supplementary characters (needed for GB 18030 repertoire support). \
 \
Java provides a very strong foundation for global programs, and IBM and the \
ICU team played a key role in providing globalization technology into Sun's \
Java. But because of its long release schedule, Java cannot always keep \
up-to-date with evolving standards. The ICU team continues to extend Java's \
Unicode and internationalization support, focusing on improving \
performance, keeping current with the Unicode standard, and providing \
richer APIs, while remaining as compatible as possible with the original \
Java text and internationalization API design."
LICENSE = "BSD-3-Clause & MIT & Unicode & LicenseRef-SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-73.1-5.3.noarch.rpm"
RPM_HASH = "66a263de530f10504f742188602f4871f6e398c616cb713d0e84778383ac82df32e775334a349c9d34f99a753d25a1e0054ad134e51326e97ce128f8667ec487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j \
mvn-com.ibm.icu-icu4j \
mvn-com.ibm.icu-icu4j-pom- \
osgi-com.ibm.icu"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
