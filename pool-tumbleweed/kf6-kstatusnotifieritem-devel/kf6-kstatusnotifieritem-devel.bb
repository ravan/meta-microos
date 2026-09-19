SUMMARY = "Development files for kstatusnotifieritem"
DESCRIPTION = "Development files for kstatusnotifieritem"
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kstatusnotifieritem-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7c58766e4f87d1e8f8f6d8335dcff33c8d027e018f276cab9bcd3f1d0a36b4b689292fe91d43522a98c57cdc9cf17ec05a8c7667fbb7209fa91c342b7b9e3f60"

RPROVIDES:${PN} += "cmake-KF6StatusNotifierItem \
kf6-kstatusnotifieritem-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
cmake-Qt6Gui \
cmake-Qt6Widgets \
cmake-Qt6Xml \
libKF6StatusNotifierItem6"

inherit rpm
