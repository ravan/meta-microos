SUMMARY = "Lite version of nanoxml"
DESCRIPTION = "NanoXML/Lite is the successor of NanoXML 1.x. It is still small (only \
6KB) and features a much faster algorithm. It is recommended if you \
are currently using NanoXML 1.x and do not want to adapt your code \
for the new API or if you are coding applications that have to be \
very small (like applets or embedded code). Please note that \
NanoXML/Lite has only limited functionality (no mixed content, DTD is \
ignored...)."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-lite-2.2.3-6.10.noarch.rpm"
RPM_HASH = "d1f82a7a00d11fef737f0dfa6ecfc3dd38bbca7658ac5e0cdf3e8bacfac329f6664b26ba9f3286d85661160e947a587b34f6234d5df5387f998ba8d93d3a0b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-lite"

RDEPENDS:${PN} += ""

inherit rpm
