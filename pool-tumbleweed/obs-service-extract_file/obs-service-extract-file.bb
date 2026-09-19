SUMMARY = "An OBS source service: Extract a file from an archive"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports to extract a file from an archive, for example a spec file from a tar."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "obs-service-extract_file-0.4-1.18.noarch.rpm"
RPM_HASH = "64cc9f2ceec911c2e1cf61cc61fab18f4b5759de2d35bd6ee5883f1022c7f772ce6cd0596c0e2d0606b137c716c0d07d78fa47d4be45e95cddd96ed1e82c39f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-extract-file"

RDEPENDS:${PN} += "/usr/bin/bash \
bzip2 \
gzip \
tar \
unzip \
xz"

inherit rpm
