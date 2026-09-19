SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python313-qt5-remoteobjects-devel-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "8eb8b3b6e038983bdc61be5e49894bf303c6e79d34d01f36d12fb30e557e7bf9e0416e1b7224247053c1ad6179c53a3943a8bc0f3d5a9e2a757a6e861cd765b9"

RPROVIDES:${PN} += "python3-qt5-remoteobjects-devel \
python313-qt5-remoteobjects-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5RemoteObjects \
python-abi \
python313-qt5-devel"

inherit rpm
