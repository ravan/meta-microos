SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwallet-devel-5.116.0-2.9.aarch64.rpm"
RPM_HASH = "aff20eb276cd79c4501a378fb74c9c72a82706bff18ee4630b549da1b96140b3e5698b9e7d4cd71bebb65b0aad3f95c3a0d2508d9148217e74594f73a58e4cd7"

RPROVIDES:${PN} += "cmake-KF5Wallet \
kwallet-devel \
kwallet-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
libKF5Wallet5 \
libkwalletbackend5-5"

inherit rpm
