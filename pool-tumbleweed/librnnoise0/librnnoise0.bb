SUMMARY = "Recurrent neural network for audio noise reduction - Shared library"
DESCRIPTION = "RNNoise is a noise suppression library based on a recurrent neural network. \
 \
This package holds the shared library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "librnnoise0-0.2-2.9.aarch64.rpm"
RPM_HASH = "e314c1af8ca8297febe81d03f683539353b3d262efe976a79f823fe3769514dc1bc056620f7c6294dcc353174e230894924413baed5e29de44fba878aa6e771d"

RPROVIDES:${PN} += "librnnoise.so.0 \
librnnoise0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
