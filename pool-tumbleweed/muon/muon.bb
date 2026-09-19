SUMMARY = "An implementation of the meson build system in c99"
DESCRIPTION = "muon is an implementation of the meson build system in c99 with \
minimal dependencies."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "muon-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "f58cb1247b790b3bd6c1e56314be8c15d29b7cc96706139de439196a7364391ad08ba52518c1030f67f0af80e81dd2efa7108b45ad3d5ee9602a588acbdb8b54"

RPROVIDES:${PN} += "muon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libpkgconf.so.7"

inherit rpm
