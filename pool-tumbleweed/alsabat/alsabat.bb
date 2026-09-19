SUMMARY = "Command-line sound tester for ALSA sound card driver"
DESCRIPTION = "BAT (Basic Audio Tester) is a simple command-line utility intended \
to help automate audio driver and sound server testing with little human \
interaction. BAT can be used to test audio quality, stress test features \
and test audio before and after PM state changes."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.16"

RPM_NAME = "alsabat-1.2.16-1.3.aarch64.rpm"
RPM_HASH = "bb331026939dc5c2c0a0922a74eba673ce1bef2d9ef0f56c07bdec72700d067dd5279ec383f61c01fe247da1689fa4abece644c8629533a8ef86280487de4791"

RPROVIDES:${PN} += "alsabat"

RDEPENDS:${PN} += "/usr/bin/bash \
alsa-utils \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
