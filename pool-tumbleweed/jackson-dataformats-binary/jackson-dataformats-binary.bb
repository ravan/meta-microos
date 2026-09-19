SUMMARY = "Jackson standard binary data format backends"
DESCRIPTION = "Parent pom for Jackson binary dataformats."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.18.9"

RPM_NAME = "jackson-dataformats-binary-2.18.9-1.1.noarch.rpm"
RPM_HASH = "7e8193e907123a3f09658e4e7234855a44f7ebcd266ed61f561be79676c310d96c7e8b806909578b01b30aef5c0f9b740ad5e743e1f9beeb3e129252e759d4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-binary-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
