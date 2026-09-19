SUMMARY = "API documentation for jcip-annotations"
DESCRIPTION = "A clean room implementation of the JCIP Annotations based entirely on the \
specification provided by the javadocs. \
 \
This package contains the API documentation."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "jcip-annotations-javadoc-1.0.1-2.7.noarch.rpm"
RPM_HASH = "48ed2aabf98882e9e4308ba8893c791a1e432c8e881e059ccd3308a789b8fa2a4f6546cb9a2e051af4bfe2daf73aa8790b59f49712582d9fd5156333100572ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcip-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
