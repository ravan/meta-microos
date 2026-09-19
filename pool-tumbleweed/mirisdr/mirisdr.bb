SUMMARY = "Support programs for Mirics MSi2500 based SDR receivers"
DESCRIPTION = "Programs that control a Mirics MSi2500 based DVB dongle in raw mode, so \
that it can be used as an SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "mirisdr-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "cbef56c8f062ffa826162e6f04877f540e8b6c7a82493e7443ab7bdb8c2d2e307a628e7bc9dfa99052e2af4e48a6b0b0761ac7b381ea8f21d43025541f07a385"

RPROVIDES:${PN} += "mirisdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmirisdr.so.4"

inherit rpm
