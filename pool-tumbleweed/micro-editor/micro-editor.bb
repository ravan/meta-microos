SUMMARY = "Micro is a terminal-based text editor that aims to be easy to use and intuitive"
DESCRIPTION = "Micro is a terminal-based text editor that aims to be easy to use and intuitive, \
while also taking advantage of the full capabilities of modern terminals. \
It comes as one single, batteries-included, static binary with no dependencies, \
and you can download and use it right now. \
 \
As the name indicates, micro aims to be somewhat of a successor to the nano editor \
by being easy to install and use in a pinch, but micro also aims to be enjoyable to \
use full time, whether you work in the terminal because you prefer it (like me), \
or because you need to (over ssh)."
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "micro-editor-2.0.15-1.8.aarch64.rpm"
RPM_HASH = "d14f0c5a89f103f0eea37cc8fbb36822ce0a27355d777a57bf6a9e5954d9fc49c34997586b872357f8b530d823ee15ee26c7ded77116d5ab0daa330929baeb8a"

RPROVIDES:${PN} += "micro-editor"

RDEPENDS:${PN} += ""

inherit rpm
