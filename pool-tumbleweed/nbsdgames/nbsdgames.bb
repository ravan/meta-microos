SUMMARY = "A collection of text-based games"
DESCRIPTION = "A new collection of console games inspired by the classic bsd-games collection."
LICENSE = "CC0-1.0"

PV = "6.0.1"

RPM_NAME = "nbsdgames-6.0.1-1.3.aarch64.rpm"
RPM_HASH = "feabd6adf8fa2485b02256f879a9012b59c3896a0c8c75dce597b4ba103cd92a37f7721241242ae2edf156a833a8df02ff4adccd90ec8b0c5ea38ecdc6289ca4"

RPROVIDES:${PN} += "nbsdgames"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
