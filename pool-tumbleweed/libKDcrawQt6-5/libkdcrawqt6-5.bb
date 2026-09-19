SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKDcrawQt6-5-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "668272cce4d51453ad2a8a327fd553ae293adc956e47c4acd240b4f48a81996f18569730b5d3f77aa2e945fea4daefb3dda58ba4ed01e0f0a1396f4a37f90dec"

RPROVIDES:${PN} += "libKDcrawQt6-5 \
libKDcrawQt6.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdcraw-qt6 \
libm.so.6 \
libraw.so.25 \
libstdc++.so.6"

inherit rpm
