SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwallet-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "034d8aaf8ef3980f4cdba971a94fd925ea818b5b5f3b33ac5e18bdae9d7a42922d3b5b7ee629fcca3541890cbea657277e84498695415841c7cd574cfd0bae81"

RPROVIDES:${PN} += "cmake-KF6Wallet \
kf6-kwallet-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libKF6Wallet6"

inherit rpm
