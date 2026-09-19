SUMMARY = "Development files for kismet"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains files files for developing applications that \
want to make use of kismet."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-devel-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "b32e96b65da0b13dbcfcfb01febee5b2ac456cb728d9060f8f9647658958b0c7f4b03e82759f7f55de271e804be6221269a27f8b27386215ef762ec83c306c50"

RPROVIDES:${PN} += "kismet-devel \
pkgconfig-kismet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kismet"

inherit rpm
