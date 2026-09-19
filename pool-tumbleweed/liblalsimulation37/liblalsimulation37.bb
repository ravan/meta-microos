SUMMARY = "Shared library for LALSimulation"
DESCRIPTION = "This package provides the shared library for LALSimulation."
LICENSE = "GPL-2.0-only"

PV = "6.2.0"

RPM_NAME = "liblalsimulation37-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "507d188dae44be17999bc12ac29be4a64f4ddfb26fd8829a05f05f63eafa62ee68da441bf0de26ad6bc2a9e83821695b0fad9f7c79a0f5bf14fb4d4027ade987"

RPROVIDES:${PN} += "liblalsimulation.so.37 \
liblalsimulation37"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalsupport.so.14 \
libm.so.6 \
libpython3.13.so.1.0"

inherit rpm
