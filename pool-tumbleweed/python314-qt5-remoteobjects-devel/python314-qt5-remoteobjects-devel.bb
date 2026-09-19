SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python314-qt5-remoteobjects-devel-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "ef7332942ef0367653df56e02dc3d90e0b4ae6103c69ced37e841c755c00aa9b020816b1480a52e52cdb54b0ed72c0b836b200eac1ea9d7bc04f42371fb72a70"

RPROVIDES:${PN} += "python314-qt5-remoteobjects-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5RemoteObjects \
python-abi \
python314-qt5-devel"

inherit rpm
