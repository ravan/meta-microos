SUMMARY = "A library to disable fsync calls"
DESCRIPTION = "libeatmydata is a small LD_PRELOAD library designed to (transparently) \
disable fsync (and friends, like open(O_SYNC)). This has two side-effects: \
making software that writes data safely to disk a lot quicker and making \
this software no longer crash safe."
LICENSE = "GPL-3.0-only"

PV = "131"

RPM_NAME = "eatmydata-131-2.6.aarch64.rpm"
RPM_HASH = "e6769761c53b493d428bb013cb3b6833e4595529fa0785a264a424499bf3267ff4cdb419b9bed5c3d9436fd52b33ce8ca730151a3062d04b3670f7e471cffee2"

RPROVIDES:${PN} += "eatmydata \
libeatmydata.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
