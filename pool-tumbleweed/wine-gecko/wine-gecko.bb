SUMMARY = "The Wine specific Gecko HTML rendering engine"
DESCRIPTION = "This package contains the prepackaged Win32 Gecko rendering engine for use by Wine."
LICENSE = "MPL-1.1+"

PV = "2.47.4"

RPM_NAME = "wine-gecko-2.47.4-1.9.noarch.rpm"
RPM_HASH = "949e2c2969e8b1012ac92e19d24078aab25456c5ad127234aaa6956fbd51fc7ce5b863f31a4bbb8f736c35805aa7ad7118ede101b8a6a6d0f099801ddfdeb18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-gecko"

RDEPENDS:${PN} += ""

inherit rpm
