SUMMARY = "Library for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.22.2"

RPM_NAME = "libraw25-0.22.2-1.1.aarch64.rpm"
RPM_HASH = "6647275fc911fb23695e06563ff179340065d50d0cb7dbb19c34b5bade23e121a2e32e910a352c5f647c9f047c2bd84dc5fea3fdf44cd00299704bca9b1ea595"

RPROVIDES:${PN} += "libraw-r.so.25 \
libraw.so.25 \
libraw25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
