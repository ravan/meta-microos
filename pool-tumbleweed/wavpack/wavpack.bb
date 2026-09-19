SUMMARY = "Hybrid Lossless Audio Compression Format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
Lossless mode is ideal for archiving audio material or any other situation \
where quality is paramount. The compression ratio depends on the source \
material, but generally is between 30% and 70%. \
 \
The hybrid mode creates both, a relatively small, high-quality lossy file that \
can be used all by itself, and a 'correction' file that (when combined with the \
lossy file) provides full lossless restoration. For some users, this means \
never having to choose between lossless and lossy compression."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "wavpack-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "9e80dc0741fd4978a7935f4f18be1a2a699bcce37f19d2f3321d8caeb6ca45b950d7aaae1623bd2200feced79cc616443da878ca27962a4528594413f92dea3d"

RPROVIDES:${PN} += "wavpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwavpack.so.1"

inherit rpm
