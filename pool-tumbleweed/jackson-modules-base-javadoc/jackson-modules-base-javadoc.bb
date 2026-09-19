SUMMARY = "Javadoc for jackson-modules-base"
DESCRIPTION = "This package contains API documentation for jackson-modules-base."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-modules-base-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "69ae1e43d5afb47ae3b6e7376dc50f6189fe749cfff4311376345c4880aeb6067bb848da6994956785273c83b067ed8caa7336552e59b4e0a7389b35631b74e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
