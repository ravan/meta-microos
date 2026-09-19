SUMMARY = "API documentation for jline3"
DESCRIPTION = "API documentation for jline3."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-javadoc-3.30.16-1.2.noarch.rpm"
RPM_HASH = "051269d567ab4ef54823203d30da489e01456f415f7e250cd3d360682aebf848133701ce4e6e456a10932ade083530d9bc4e3718a543e0326488849b2e1d6739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
