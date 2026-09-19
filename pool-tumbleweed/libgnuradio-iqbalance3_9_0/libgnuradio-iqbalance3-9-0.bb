SUMMARY = "Libraries for gr-iqbal"
DESCRIPTION = "I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20250425"

RPM_NAME = "libgnuradio-iqbalance3_9_0-0.39.0git20250425-1.5.aarch64.rpm"
RPM_HASH = "d564c1605f82d9ed0feee1cb6406b639ef90a2c4d05a78a4a8b2434faf7bd76536179be38ce2ea88e4b990f2f2dad67518b25418eff8b0dc7b82ed912f7ba0b4"

RPROVIDES:${PN} += "libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-iqbalance3-9-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libosmodsp.so.0 \
libstdc++.so.6"

inherit rpm
