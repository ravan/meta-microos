SUMMARY = "FacetimeHD firmware download and extraction tool"
DESCRIPTION = "FacetimeHD firmware download and extraction tool"
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "facetimehd-firmware-1.0-1.15.noarch.rpm"
RPM_HASH = "87ea12b240101702bd4b76509dc1e270186f81d643e8bd5673b2499d49750ce0d969935a576d3a2a8c6d8126a561ee533a62c5baf0f8abcbd2c2fab1b81d97d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "facetimehd-firmware"

RDEPENDS:${PN} += "/usr/bin/bash \
coreutils \
cpio \
curl \
unzip \
xz"

inherit rpm
