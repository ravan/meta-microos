SUMMARY = "Javadocs for jemmy"
DESCRIPTION = "This package contains the API documentation for jemmy."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "2.3.0.0"

RPM_NAME = "jemmy-javadoc-2.3.0.0-27.9.noarch.rpm"
RPM_HASH = "a2ef57a4a3d4e475e43e6b78ea68459423ea364a401e41d189afc00ccd7bb7d67a09decff0c12d4f5270a304dce441f7a28874d1f34972769b80d844800e2827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jemmy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
javapackages-tools \
jemmy"

inherit rpm
