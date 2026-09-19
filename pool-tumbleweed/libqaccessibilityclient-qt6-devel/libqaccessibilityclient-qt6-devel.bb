SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libqaccessibilityclient-qt6-devel-0.6.0-1.9.aarch64.rpm"
RPM_HASH = "5b2acb29a2e8b98e8232e5e4c19027b1ba2420e114587c7501d34bdb9ff17da314f74e130b15c237b2fe0bd927bb799dbc21d66c2c69dde47a4b64f5099f068d"

RPROVIDES:${PN} += "cmake-QAccessibilityClient6 \
libqaccessibilityclient-qt6-devel"

RDEPENDS:${PN} += "libqaccessibilityclient-qt6-0"

inherit rpm
