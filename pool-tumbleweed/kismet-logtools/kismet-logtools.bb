SUMMARY = "Kismet logtools"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains several kismetdb log tools \
 - kismetdb_dump_devices \
 - kismetdb_statistics \
 - kismetdb_strip_packets \
 - kismetdb_to_kml \
 - kismetdb_to_wiglecsv"
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-logtools-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "8eefcdcdd9165901297b628ea2fcb6e2efa2adfbe4c1d40266662063da2907436912a185d3c1bf0ab85dfdffdc7e19fd29f012bb74b432c983d94da6abe56e6c"

RPROVIDES:${PN} += "kismet-logtools"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libpcre2-8.so.0 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
