SUMMARY = "Support programs for RTL2832"
DESCRIPTION = "Programs that controls Realtek RTL2832 based DVB dongle in raw mode, so \
it can be used as a SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "rtl-sdr-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "218832872b36044507f6ccad29c11db21fd2d54e3891b68d84cec5f19a756296d83563c0b50c13180646ed39646723af0c33205b74305fddc3663c9091eeecf0"

RPROVIDES:${PN} += "rtl-sdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
librtlsdr.so.0"

inherit rpm
