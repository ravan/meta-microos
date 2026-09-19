SUMMARY = "Qt 6 RemoteObjects Tools"
DESCRIPTION = "This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjects-tools-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "75c03f70c5559d560925ca1201b50452f8be1a5f5ecb426de57fd7dda24373f45f9376f4eb9833923572ae45a934e02ad08a0de12a7f4c4f1a8c18f4124ac0b2"

RPROVIDES:${PN} += "qt6-remoteobjects-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
