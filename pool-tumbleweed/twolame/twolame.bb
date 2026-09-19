SUMMARY = "An optimised MPEG Audio Layer 2 (MP2) encoder"
DESCRIPTION = "TwoLAME is an optimised MPEG Audio Layer 2 (MP2) encoder based on \
tooLAME by Mike Cheng, which in turn is based upon the ISO dist10 \
code and portions of LAME. TwoLAME includes libtwolame, a fully \
thread-safe shared library with an API very similar to LAME's."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "twolame-0.4.0-1.25.aarch64.rpm"
RPM_HASH = "d751cad2e00940086335204e882531101c290f48322eab022261cb25f5e568900be3c42bb8384ee25bc0206b2dcc61e5d19ae42e75e64fca3097573ff58e1491"

RPROVIDES:${PN} += "twolame"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile.so.1 \
libtwolame.so.0"

inherit rpm
