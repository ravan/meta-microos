SUMMARY = "Javadoc for xmlgraphics-batik"
DESCRIPTION = "Javadoc for xmlgraphics-batik."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-javadoc-1.18-1.7.noarch.rpm"
RPM_HASH = "5170beb1eaa3c3717e77ae70fd05f50666f7c9fbba302a9cc7f7c930e4641dabcb24f41009b10be3a0265dc71ce5965ebe6da620c5c2f5ca011c147d0431ac24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-javadoc \
xmlgraphics-batik-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
