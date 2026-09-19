SUMMARY = "EPS image format plugin for Qt"
DESCRIPTION = "This plugin provides support for the EPS document format for QtGui. As \
it invokes ghostscript for conversion, it should only be used in trusted \
environments."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kimageformats-eps-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c0d67ab6bbe720c4a55b6c2df4bf7a1ababa280b965b736daa4c383a63f258aa14555afdf8bf640b582521d9bfba7b4a88acd021dd9f91bf073573f4cacc9472"

RPROVIDES:${PN} += "kf6-kimageformats-eps"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
