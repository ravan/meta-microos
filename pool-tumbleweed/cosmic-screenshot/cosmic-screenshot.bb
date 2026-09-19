SUMMARY = "Utility for capturing screenshots via XDG Desktop Portal"
DESCRIPTION = "Utility for capturing screenshots via XDG Desktop Portal."
LICENSE = "GPL-3.0-only"

PV = "1.0.8"

RPM_NAME = "cosmic-screenshot-1.0.8-1.7.aarch64.rpm"
RPM_HASH = "1fea5a783843a97620048ec92f64c5113ccc24cf3b81aeadaa011d931700c70cecb9a51031854390b75c576a1338a7aba09f993da936ffd6e756d8b5db511b9d"

RPROVIDES:${PN} += "cosmic-screenshot"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
