SUMMARY = "Hybrid Lossless Audio Compression Format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
Lossless mode is ideal for archiving audio material or any other situation \
where quality is paramount. The compression ratio depends on the source \
material, but generally is between 30% and 70%."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "libwavpack1-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "aeb3830ef3118d5bfdccb857bcf00b0598b19d3f68e00bbe846acf913a27377460a8adf65a759779edc752822cfa71ed00bf994ede690f7912debb3eff58ebaa"

RPROVIDES:${PN} += "libwavpack.so.1 \
libwavpack1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
