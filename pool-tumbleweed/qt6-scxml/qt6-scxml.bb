SUMMARY = "SCXML (state machine notation) compiler and related tools"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines from SCXML \
files."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-scxml-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0910f9b39be361693b992e82baf8871ffa45e0f724a94ec6262370ea4772e7c37212427fe22325b7f60dfd793a3c11148960c91bd5d3c66b5f8c3871f9f127bf"

RPROVIDES:${PN} += "libqscxmlecmascriptdatamodel.so \
qt6-scxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
