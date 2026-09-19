SUMMARY = "API documentation for xmvn-mojo"
DESCRIPTION = "This package provides API documentation for xmvn-mojo."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-mojo-javadoc-4.3.0-8.1.noarch.rpm"
RPM_HASH = "6008f7b0cf3e79e46b1a8ee6cb1a8fed955c93821b7c83bc044f331d94788d86d5bae68fc2309f654cc7abf40c94b3972264ede297ff378bbe9d5fb6d24b1f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-mojo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
