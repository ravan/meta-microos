SUMMARY = "Package provides recommended R-nnet"
DESCRIPTION = "This packages provides R-nnet, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.20"

RPM_NAME = "R-nnet-7.3.20-58.3.aarch64.rpm"
RPM_HASH = "4934c3248e59406aca22f14464f9d0b3f100db51ad741f6f6b9709e3435e49886855f741e963d5e52e43658126afda096f7589358e5db2f8793c41d2d9c32aae"

RPROVIDES:${PN} += "R-nnet"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
