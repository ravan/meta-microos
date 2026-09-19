SUMMARY = "SvxLink Async libs"
DESCRIPTION = "The Async library files."
LICENSE = "GPL-2.0-only"

PV = "1.9.1"

RPM_NAME = "libasync1_9-1.9.1-7.1.aarch64.rpm"
RPM_HASH = "776c096981fdbadab39c16e39b4bd28c6c84281c2d0ff103037cd99417c3bb59fe464fe732db5348c71f2ec5a45efcb8549d62396856fe5a974ce14134ea1790"

RPROVIDES:${PN} += "libasync1-6 \
libasync1-9 \
libasyncaudio.so.1.9 \
libasynccore.so.1.9 \
libasynccpp.so.1.9 \
libasyncqt.so.1.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libasound.so.2 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgsm.so.1 \
libm.so.6 \
libopus.so.0 \
libresolv.so.2 \
libsigc-2.0.so.0 \
libspeex.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
