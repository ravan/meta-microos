SUMMARY = "AfterStep digital clock"
DESCRIPTION = "A swallowable applet shows clock and calendar. Supports themes for \
different looks."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.12"

RPM_NAME = "asclock-2.0.12-315.3.aarch64.rpm"
RPM_HASH = "4b0267637f5a770dabacc1ce4bd1d64c6850475bd8d2e9782d9553a29ef1cd30af6703acbdae4a4109ab5251e174fa2e2cfa0e83db0d526ff176365562a1f1d5"

RPROVIDES:${PN} += "asclock \
astools-/usr/X11R6/bin/asclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6"

inherit rpm
