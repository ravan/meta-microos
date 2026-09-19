SUMMARY = "Jackson standard text-format data format backends"
DESCRIPTION = "Parent pom for Jackson text-format dataformats."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformats-text-2.18.9-1.1.noarch.rpm"
RPM_HASH = "b275229f1bbdd49a875d9bbe0327ddad2e91ed6384308e2575432e42589fcd995f9f5cfe56d043703d92371490cd5ec3e9175d55a14f2600467e4383e6db7e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-text-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
