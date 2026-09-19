SUMMARY = "Documentation for xplayer-plparser"
DESCRIPTION = "This package offers you the documentation for xplayer-plparser."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "xplayer-plparser-doc-1.0.3-1.13.noarch.rpm"
RPM_HASH = "121371b5fe3d5eff8779e4cbb6b75a326df1242011c91db738d4e08869d4ddf8d8c82af39b5a220bb1598bcbb14e3699d41c44ed4e11d466cd544a488a25a951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xplayer-plparser-doc"

RDEPENDS:${PN} += ""

inherit rpm
