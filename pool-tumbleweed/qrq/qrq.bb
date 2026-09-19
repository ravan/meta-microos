SUMMARY = "CW trainer"
DESCRIPTION = "qrq is a Morse telegraphy trainer. It is not intended for learning telegraphy, \
but to improve the ability to copy callsigns at high speeds, as needed for \
example for Contesting."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.3.5"

RPM_NAME = "qrq-0.3.5-3.8.aarch64.rpm"
RPM_HASH = "60ba438dd60a57f40589c3ee41fc9d229fd892a3f331680165a0c3fbfb774058108e28ea993f852f6f45db8329e9ae1bf011d1b1b94362428c56310a14bbe902"

RPROVIDES:${PN} += "qrq"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libtinfo.so.6"

inherit rpm
