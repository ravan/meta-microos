SUMMARY = "Small editor"
DESCRIPTION = "JED text editor"
LICENSE = "GPL-2.0-only"

PV = "0.99.19+git177.55b1d75"

RPM_NAME = "jed-0.99.19+git177.55b1d75-1.7.aarch64.rpm"
RPM_HASH = "64b3ea6ce8cb23c574965e10fa64eaecd161805fd6ad8caf96fad04cebdc474a3d1c9f232e265fba88bee93534d43d2e120517961ef1a687ff496e4e048408c3"

RPROVIDES:${PN} += "jed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2 \
slang-slsh"

inherit rpm
