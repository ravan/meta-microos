SUMMARY = "An OBS source service: Recompress files"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports to compress, uncompress or recompress files from or to \
 \
 none : No Compression \
 gz   : Gzip Compression \
 bz2  : Bzip2 Compression \
 xz   : XZ Compression \
 zstd : Zstd Compression"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "obs-service-recompress-0.5.2-3.3.noarch.rpm"
RPM_HASH = "66487b65dda139555aa617639dfceef3f6b368ed5f8dbc1fb2bc245e885eadbd9266eae1e11b68ede93c15e66a87051b746cf805dd3e0a7f5714e3d46a947300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-recompress"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gzip \
bzip2 \
xz \
zstd"

inherit rpm
