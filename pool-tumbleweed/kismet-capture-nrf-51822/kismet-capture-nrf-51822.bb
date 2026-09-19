SUMMARY = "Kismet nRF 51822 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 51822 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-nrf-51822-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "578c10e609580857e0263fe388792473919e65d52022ed3ca4322e36d0ba2faf7e717c3495cb161d291812181223fe795ca00610b8f5c30d165f4d7f561c1734"

RPROVIDES:${PN} += "kismet-capture-nrf-51822"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libwebsockets.so.22"

inherit rpm
