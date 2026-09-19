SUMMARY = "IB Performance tests"
DESCRIPTION = "gen2 uverbs microbenchmarks"
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "26.04.17"

RPM_NAME = "perftest-26.04.17-1.3.aarch64.rpm"
RPM_HASH = "dfe935ae12e736dbfe9703cd9f2c2dabe8d828c8e17e25d3d9bc9ab8e3aa976d7755651caac7293ceb3b82791a53d63572da29c3ea51ea6ccd32029a9a9b4870"

RPROVIDES:${PN} += "perftest"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libefa.so.1 \
libhns.so.1 \
libibumad.so.3 \
libibverbs.so.1 \
libm.so.6 \
libmlx5.so.1 \
libpci.so.3 \
librdmacm.so.1"

inherit rpm
