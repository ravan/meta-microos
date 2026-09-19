SUMMARY = "Udev rules to use Wooting from normal users"
DESCRIPTION = "udev rules to use Wooting tools from normal users."
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "wooting-udev-rules-0.0.4-1.6.noarch.rpm"
RPM_HASH = "f730bb14e9d50f784751c82ff498685df90c1db6aaac00e1f884f8b1753b76f950133b8307afc91d23d08704aee607dfca0d734d200cdd9190e0c31888a82936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wooting-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
