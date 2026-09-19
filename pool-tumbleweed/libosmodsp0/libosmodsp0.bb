SUMMARY = "SDR DSP primitives"
DESCRIPTION = "libosmo-dsp is a C language library for common DSP (Digital \
Signal Processing) primitives for SDR (Software Defined Radio)."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "libosmodsp0-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "849ecc3324d2a6862e25ae8f5ec97a17e38b8632907be044cc71ecb6e301edc9fb80ea2152293a352f5fc25eb15b828eaeaa440ca1377c5c6a8b3d5402db9f61"

RPROVIDES:${PN} += "libosmodsp.so.0 \
libosmodsp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6 \
libmvec.so.1"

inherit rpm
