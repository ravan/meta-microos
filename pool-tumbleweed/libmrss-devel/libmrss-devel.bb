SUMMARY = "Headers and development package for libmrss"
DESCRIPTION = "libmRSS is a C library for parsing, writing, and creating RSS (Rich Site \
Summary, Really Simple Syndication, and RDF Site Summary) and ATOM files or \
streams. The formats supported are: RSS 0.91, RSS 0.92, RSS 1.0, RSS 2.0, ATOM \
0.3, and ATOM 1.0."
LICENSE = "LGPL-2.1-only"

PV = "0.19.3"

RPM_NAME = "libmrss-devel-0.19.3-1.12.aarch64.rpm"
RPM_HASH = "59772794eb999097f99fd8f6f446382fee0a74f654ad894509a65b6923dd6f50a688372ff760d10fa7831953bfa4d111b2053ab29031d85f48810ebaf707929e"

RPROVIDES:${PN} += "libmrss-devel \
pkgconfig-mrss"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
curl-devel \
libmrss0 \
libnxml-devel \
pkgconfig-nxml"

inherit rpm
