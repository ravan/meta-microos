SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libqaccessibilityclient-qt5-devel-0.6.0-1.9.aarch64.rpm"
RPM_HASH = "68ed2cf0952de9a6d6995e98193508e9a5d38405281e5e4a292fa3e84de10578454a3e50748b6b3f8b76415f239ecd2e40a3e3cc32c3bcd3195bf3799da79393"

RPROVIDES:${PN} += "cmake-QAccessibilityClient \
libqaccessibilityclient-qt5-devel"

RDEPENDS:${PN} += "libqaccessibilityclient-qt5-0"

inherit rpm
