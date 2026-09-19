SUMMARY = "C++ SyncML Client Engine"
DESCRIPTION = "Libfunambol allows to integrate a SyncML stack in a C++ application on a \
variety of platforms. Currently, Windows, Windows Mobile and Linux, Mac OS X, \
iPhone and Symbian are actively supported, but you can easily build it on other \
Unixes or other mobile/embedded platforms."
LICENSE = "AGPL-3.0"

PV = "9.0.1"

RPM_NAME = "libfunambol-9_0_1-9.0.1-16.35.aarch64.rpm"
RPM_HASH = "3734425a446bd063074a84be012ef50eac666fd3d458640178cbcbbb60a0a9b546752ba5e20f474f6f0a34723487130c10a88874fa6c419dfe80615452cdc118"

RPROVIDES:${PN} += "libfunambol-9-0-1 \
libfunambol-9.0.1.so \
libfunambol9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
