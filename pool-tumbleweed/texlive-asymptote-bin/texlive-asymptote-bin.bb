SUMMARY = "Binary files of asymptote"
DESCRIPTION = "Binary files of asymptote"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78155"

RPM_NAME = "texlive-asymptote-bin-2026.20260301.svn78155-120.4.aarch64.rpm"
RPM_HASH = "270de2e8a9cdbac3a466c82de8fcd35a0f6ffc316c1c03ec61bb55f0c8e08e292221b894971be2a703cae83bb382b77375e0bcb7445db5769e667dd8bf864a88"

RPROVIDES:${PN} += "texlive-asymptote-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libcurl.so.4 \
libfftw3.so.3 \
libgcc-s.so.1 \
libglut.so.3 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libreadline.so.8 \
libsigsegv.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libtirpc.so.3 \
libz.so.1 \
texlive-asymptote"

inherit rpm
