SUMMARY = "Demo for xmlgraphics-batik"
DESCRIPTION = "Demonstrations and samples for xmlgraphics-batik."
LICENSE = "Apache-2.0"

PV = "1.18"

RPM_NAME = "xmlgraphics-batik-demo-1.18-1.7.noarch.rpm"
RPM_HASH = "a310c4d0cc23f5b8366670538f2fd9394e24ab3ae2f416f92e56aa184a726e944136fc253893efe77b18e1b0a37422e3cebfe1cf9cddd958d90ca7dab09ec389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-demo \
xmlgraphics-batik-demo"

RDEPENDS:${PN} += "xmlgraphics-batik"

inherit rpm
