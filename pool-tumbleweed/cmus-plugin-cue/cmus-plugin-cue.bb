SUMMARY = "CUE input plugin for the C* Music Player"
DESCRIPTION = "This package provides CUE sheet support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-cue-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "8d77842e5a3da075e0b1b202457826c71e9aff3edb9a16f2968bd1728bf8a383b81fed2b8026c844648cd66dccd6c8a087a9986838da5f3e4905126755d5401c"

RPROVIDES:${PN} += "cmus-plugin-cue"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
