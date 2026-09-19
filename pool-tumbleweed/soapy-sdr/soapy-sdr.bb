SUMMARY = "Vendor and platform neutral SDR support library"
DESCRIPTION = "A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1+git20250223.6e99da1"

RPM_NAME = "soapy-sdr-0.8.1+git20250223.6e99da1-2.6.aarch64.rpm"
RPM_HASH = "203c56723a72b03292e4a6319d6a62d6d1e5b2d8ee93999a52c6b183ca381b1e4f619bed850671b9ac71ea7ec3df22b5e920f2d544f682dd731b7ce55c2f3e37"

RPROVIDES:${PN} += "soapy-sdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
