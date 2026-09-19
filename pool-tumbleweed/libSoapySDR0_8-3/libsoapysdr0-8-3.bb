SUMMARY = "Vendor and platform neutral SDR support library"
DESCRIPTION = "A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1+git20250223.6e99da1"

RPM_NAME = "libSoapySDR0_8-3-0.8.1+git20250223.6e99da1-2.6.aarch64.rpm"
RPM_HASH = "86e0f534a4f183fa0ed01212d6a987fad9e985ae4037ba289a42631e85a2f9c24ff886af2e45263b3812bcb1c5c4bd87aace7af335e6697f4161a283fc209dcb"

RPROVIDES:${PN} += "libSoapySDR.so.0.8-3 \
libSoapySDR0-8-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
