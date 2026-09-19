SUMMARY = "Speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time."
LICENSE = "BSD-2-Clause"

PV = "5.0.3+git20241211.69167fb"

RPM_NAME = "libpocketsphinx5-5.0.3+git20241211.69167fb-1.7.aarch64.rpm"
RPM_HASH = "16920dd1bb39d20e60a9edd54819642f99ab0eda055144f96a77a87f4a9e74d39af0a1fb8dd00a004139f4c365db2e930ebabd971cbc07ca2a0798b57f84ab1d"

RPROVIDES:${PN} += "libpocketsphinx.so.5 \
libpocketsphinx5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
pocketsphinx"

inherit rpm
