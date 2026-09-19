SUMMARY = "R language libraries"
DESCRIPTION = "This package contains the files from R/lib to make their usage \
possible without installing a complete R. (I.e. VTK uses this)"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-core-libs-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "d16c4e50601a10dda718fa39f4ab5233481769236649e5d7bf73546af1dcacbbc721a55e141c7b3b7ba3d8ab536d8c9d34857ede2d2ff0895c32fbcd146adb12"

RPROVIDES:${PN} += "R-core-libs \
config-R-core-libs \
libR.so \
libRblas.so \
libRlapack.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
liblzma.so.5 \
libm.so.6 \
libmvec.so.1 \
libpcre2-8.so.0 \
libreadline.so.8 \
libz.so.1 \
libzstd.so.1"

inherit rpm
