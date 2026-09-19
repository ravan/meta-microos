SUMMARY = "Libraries for OsmoSDR"
DESCRIPTION = "OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "libosmosdr0-0.1+git.20151211-2.8.aarch64.rpm"
RPM_HASH = "6e3e9bb5ebdc764a8388164549e7d341a2ce2a2581e18fa5f2990b76a58f32d493ba81e3f3104fc83ecd7a42c7fc2ab38d4e3181fa6e3f14574d2010e8553644"

RPROVIDES:${PN} += "libosmosdr.so.0 \
libosmosdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
