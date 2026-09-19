SUMMARY = "VOLK module for gnss-sdr"
DESCRIPTION = "Set of kernels targeted at gnss-sdr, but also usable \
standalone."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause & Zlib"

PV = "0.0.21"

RPM_NAME = "gnss-sdr-volk-0.0.21-1.1.aarch64.rpm"
RPM_HASH = "6f0a65140540900dba09f92c74e4cf112ff4b8f49b0beccb4412a1b550daf8fc10514fff9eece777e1fd09a1c72002bdf685dd258ef59147258f05d9f6bcd7a8"

RPROVIDES:${PN} += "gnss-sdr-volk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvolk-gnsssdr.so.0.0.21"

inherit rpm
