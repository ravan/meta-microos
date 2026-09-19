SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python313-qt5-remoteobjects-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "c1ec5ebb1999da3ce48d190c4bfed15388fa2131a0d05fd9d856de158a0a04ba0b8829c2c82a7845bf66e356d5cd23f79bb89a784ab0e852d522e317c6cd7e86"

RPROVIDES:${PN} += "python3-qt5-remoteobjects \
python313-qt5-remoteobjects"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5RemoteObjects.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-qt5"

inherit rpm
