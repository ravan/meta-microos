SUMMARY = "Javadoc for test-interface"
DESCRIPTION = "Javadoc for test-interface."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "test-interface-javadoc-1.0-4.6.noarch.rpm"
RPM_HASH = "0442245c9ac83a6d9ee5ec443ffcf56edec7556d05c7a2d1de6d287a19b3ac96a56c081ccc34676ba6dd1ac9805b359310e512e6ecd243a627adbd470a784c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "test-interface-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
