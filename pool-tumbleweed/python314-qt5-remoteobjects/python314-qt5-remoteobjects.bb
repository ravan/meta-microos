SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python314-qt5-remoteobjects-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "6503b04483f871966b530ed11880dad3c6a739478c691eb931e8faf9d6b664166a987dda779d052990fca448b93242e437f092c62b7846ebe97cd3682427b2b1"

RPROVIDES:${PN} += "python314-qt5-remoteobjects"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5RemoteObjects.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-qt5"

inherit rpm
