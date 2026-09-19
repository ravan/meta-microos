SUMMARY = "MIME streaming extension"
DESCRIPTION = "Provides a streaming API to access attachments parts in a MIME message."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "mimepull-1.10.0-1.7.noarch.rpm"
RPM_HASH = "d3c681c3d3e8ad3a496404e1c4161b8ae5a5f450e0327960c8a1b6caf0a8e5c51553784d4e825c8baeb67643454730a94ab787c7c0c9fae0af874bd6f34e3618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mimepull \
mvn-org.jvnet.mimepull-mimepull \
mvn-org.jvnet.mimepull-mimepull-pom- \
osgi-org.jvnet.mimepull"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
