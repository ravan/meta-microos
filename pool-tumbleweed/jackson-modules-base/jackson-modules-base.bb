SUMMARY = "Jackson modules: Base"
DESCRIPTION = "Jackson 'base' modules: modules that build directly on databind, \
and are not data-type, data format, or JAX-RS provider modules."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-modules-base-2.18.9-1.1.noarch.rpm"
RPM_HASH = "69bf6ef58446425a9c7f3c3edd36c7c601a67239b044a4a2fb8d262359cd4e6793d10affd06eb23f58e7e3bc165fe60a04da53f1c4804cb1255900d865ff5de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base \
mvn-com.fasterxml.jackson.module-jackson-modules-base-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
