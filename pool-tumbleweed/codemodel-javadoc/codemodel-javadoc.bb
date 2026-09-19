SUMMARY = "Javadoc for codemodel"
DESCRIPTION = "This package contains the API documentation for codemodel."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.6"

RPM_NAME = "codemodel-javadoc-2.6-6.6.noarch.rpm"
RPM_HASH = "ba9bbdcd91f22d2e39cc9078f4d5cfd6d6a2d881f930c9448b21f82a04a9b21f00f349b14722934f62a3939f2ba363881b603ece9a4e3aaec77dfe3732c81232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codemodel-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
