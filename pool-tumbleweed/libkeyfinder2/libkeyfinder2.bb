SUMMARY = "Library for estimating the musical key of digital audio"
DESCRIPTION = "libkeyfinder is a small C++11 library for estimating the musical key of digital audio"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.8"

RPM_NAME = "libkeyfinder2-2.2.8-1.5.aarch64.rpm"
RPM_HASH = "bd1a7c1cc510fc94b2d79cc69016e9acb3a11010fdb9c2fba2f0eaf9978687b8050b049aeee23be36345525b3592e0eb438d5b3cb0920b26afbbca72b7bf8377"

RPROVIDES:${PN} += "libkeyfinder \
libkeyfinder.so.2 \
libkeyfinder2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
