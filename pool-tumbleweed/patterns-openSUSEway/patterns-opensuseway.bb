SUMMARY = "The openSUSEway desktop environment pattern"
DESCRIPTION = "This pattern installs the openSUSE look and feel for sway."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "patterns-openSUSEway-0.17.0-1.4.noarch.rpm"
RPM_HASH = "5d0aa46d76273c6544cee080caf918341453b968858ff3152e231009b5d53fc12145ad40966f0d8213937e6b89563d0304a6f2b96be5de6aead282edda7bddc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSEway"

RDEPENDS:${PN} += "openSUSEway"

inherit rpm
