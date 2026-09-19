SUMMARY = "Infiniband Unified Communication Transport"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libuct0-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "33a306517305770351af9c8817a28b6e91710c3b55dbcfd3133d15e3c606ebf6c46aa5263ea6082d5da3ccb583ed5da09ca93faab7232ed718e88cf60a1d2014"

RPROVIDES:${PN} += "libuct-cma.so.0 \
libuct-ib-efa.so.0 \
libuct-ib-mlx5.so.0 \
libuct-ib.so.0 \
libuct-rdmacm.so.0 \
libuct.so.0 \
libuct0 \
libucx-perftest-mad.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libefa.so.1 \
libgomp.so.1 \
libibmad.so.5 \
libibumad.so.3 \
libibverbs.so.1 \
libmlx5.so.1 \
librdmacm.so.1 \
libucs.so.0"

inherit rpm
