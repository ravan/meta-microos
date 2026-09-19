SUMMARY = "Provides libknet1 zstd support"
DESCRIPTION = "Provides zstd compression support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-compress-zstd-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "ae2604ceb38f9b0999479e4fe807bcdb1c168a06a6f395cb38f187fde93060c2171eec30ffac8da928e965947ac72c5e9c26cae3a755ade573f36147a87108f8"

RPROVIDES:${PN} += "libknet1-compress-zstd-plugin"

RDEPENDS:${PN} += "libc.so.6 \
libknet1 \
libzstd.so.1"

inherit rpm
