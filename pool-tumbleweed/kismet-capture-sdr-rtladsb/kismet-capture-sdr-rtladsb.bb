SUMMARY = "Kismet SDR rtladsb capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the SDR rtladsb capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-sdr-rtladsb-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "997a292623786c7d6dcadc0b592652db4fb9b0c5ac5d9c1b8de4801dd94ee840cff7f853b16334451699040d3bc9a55d9f4a876989f267c42206fd29b4329e3e"

RPROVIDES:${PN} += "kismet-capture-sdr-rtladsb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
librtlsdr.so.0 \
libwebsockets.so.22"

inherit rpm
