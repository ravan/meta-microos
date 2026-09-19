SUMMARY = "Classes to read and interact with KColorScheme"
DESCRIPTION = "Classes to read and interact with KColorScheme."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcolorscheme-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2f1d002d34c254e99eead7c7101b8cc36c84b1fb3edfe16af3ce7342d6f265a327cd4ebe51eb90f37899cb102b45fd3502b4ec6a71d811fb59c4b56e4cecf69c"

RPROVIDES:${PN} += "kf6-kcolorscheme"

RDEPENDS:${PN} += ""

inherit rpm
