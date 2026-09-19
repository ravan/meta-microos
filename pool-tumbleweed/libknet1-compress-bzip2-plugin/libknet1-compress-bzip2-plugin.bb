SUMMARY = "Provides libknet1 bzip2 support"
DESCRIPTION = "Provides bzip2 compression support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-compress-bzip2-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "975e9a6ee6e1ba8249beee979eb78779da501451c36a69e74099c43b9ddfde42279ac59fc0aec631335fa9b09232a3634a732b962397f4f3ca17ff2bb908cdec"

RPROVIDES:${PN} += "libknet1-compress-bzip2-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libknet1"

inherit rpm
