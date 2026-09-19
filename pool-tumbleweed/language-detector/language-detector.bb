SUMMARY = "Language Detection Library for Java"
DESCRIPTION = "A language detector / language guesser library in Java."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "language-detector-0.6-3.10.noarch.rpm"
RPM_HASH = "c9f9aafa22a4031b5107f1425af9fb5822f3886ab614d89e48025e864ad42d13026aa67bb208820561d865b5a9b5fe65b80f370b403c39e5617aebdfdf5fea7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "language-detector \
mvn-com.optimaize.languagedetector-language-detector \
mvn-com.optimaize.languagedetector-language-detector-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-com.intellij-annotations \
mvn-org.slf4j-slf4j-api"

inherit rpm
