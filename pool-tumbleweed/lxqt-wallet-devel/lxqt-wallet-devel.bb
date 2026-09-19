SUMMARY = "Development files for lxqt-wallet"
DESCRIPTION = "This package contains the header files needed to develop application that \
use lxqt-wallet."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "lxqt-wallet-devel-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "f5bdaba853b46c10c429e983185e332742a7ffe4705e9d142712c6ad28ce7c37dc5f39c9bdb63a0d69dc012ed83fbbf24e786c270f8fb2e0cfd259bef3d54bad"

RPROVIDES:${PN} += "lxqt-wallet-devel \
pkgconfig-lxqt-wallet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxqt-wallet6-0-0 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Widgets"

inherit rpm
