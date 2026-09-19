SUMMARY = "IntelliJ IDEA Annotations"
DESCRIPTION = "A set of annotations used for code inspection support and code documentation."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-23.0.0-2.12.noarch.rpm"
RPM_HASH = "ce42f9180d7b1a6c0ac3b47a123e8eef2dc392fa00c5303f909cf6dfb33694bb0630164315ab85a32a6449a511a1fd403e8e6c6e9b7d723294c7581a74045e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations \
mvn-com.intellij-annotations \
mvn-com.intellij-annotations-pom- \
mvn-org.jetbrains-annotations \
mvn-org.jetbrains-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
