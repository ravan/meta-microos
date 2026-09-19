SUMMARY = "Kismet SDR rtl433 capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet SDR rtl433 capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-sdr-rtl433-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "04dcbad1313133b79631cfe0b9983f48c25bdb244d3a0f884265bc01ad207d57a392ade1a8ca0d0ac69f41b6574492196cd9fd83aa8acf16eee55c7d19c10458"

RPROVIDES:${PN} += "kismet-capture-sdr-rtl433"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
librtlsdr.so.0 \
libwebsockets.so.22"

inherit rpm
