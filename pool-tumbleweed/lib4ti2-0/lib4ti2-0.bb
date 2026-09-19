SUMMARY = "Library for computation of Gröbner bases with 4ti2"
DESCRIPTION = "This package contains the 4ti2 program library, which comes in three \
flavors: \
* 32-bit precision integers \
* 64-bit precision integers \
* arbitrary precision integer support through use of GNU MP"
LICENSE = "GPL-2.0-or-later"

PV = "1.6.15"

RPM_NAME = "lib4ti2-0-1.6.15-1.3.aarch64.rpm"
RPM_HASH = "1a87911d16de884baf63dc7b47fe48d5b0610c0c1fff477abcab131911c5ef80ae178b7464e249644ec2b1e9b5701da84365a23ede89034ec619f14cb4c770b4"

RPROVIDES:${PN} += "lib4ti2-0 \
lib4ti2common.so.0 \
lib4ti2gmp.so.0 \
lib4ti2int32.so.0 \
lib4ti2int64.so.0 \
lib4ti2util.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglpk.so.40 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6"

inherit rpm
