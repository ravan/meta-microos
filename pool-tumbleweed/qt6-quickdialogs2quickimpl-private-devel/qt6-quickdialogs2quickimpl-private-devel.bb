SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Impl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickdialogs2quickimpl-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "1a0fe0c7cdafa9477aa9a9ff87d191302e6549b789102c991be99f8a5699e25c40bf55e783564c137c6ce76b3b5ba0f8d2fa540f103158cc2742bee81c64d395"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2QuickImplPrivate \
qt6-quickdialogs2quickimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2QuickImpl"

inherit rpm
