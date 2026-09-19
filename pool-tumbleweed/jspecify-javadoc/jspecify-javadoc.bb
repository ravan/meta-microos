SUMMARY = "API documentation for jspecify"
DESCRIPTION = "API documentation for jspecify."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jspecify-javadoc-1.0.0-2.6.noarch.rpm"
RPM_HASH = "0e16eb3c59ea55f99aea5e0d593ffd0f80bc42afd1ec7d43dde4a09a9814bf157de6ec57b8af975f7f4bddd7e051fd45ceebbc0b59268d6af9098c76d70e37fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jspecify-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
