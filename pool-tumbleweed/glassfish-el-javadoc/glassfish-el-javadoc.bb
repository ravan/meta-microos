SUMMARY = "Javadoc for glassfish-el"
DESCRIPTION = "This package contains javadoc for glassfish-el."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-javadoc-3.0.1~b08-3.8.noarch.rpm"
RPM_HASH = "67ef40c3d1fded174f5f9d2e137f4edc7bacdad4c5fb6f8213041ebd49702525dd2706eb4b3e9f1d7a84ab404c9d2a7c0fc052a02e6ab90e02c6ac380ae2268b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
