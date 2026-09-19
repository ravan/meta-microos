SUMMARY = "Opus input plugin for the C* Music Player"
DESCRIPTION = "This package provides Opus input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-opus-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "68ba0f0d3acb46e80f43426aa087f0a02a7411005d55c6663509930768899eac3d1b11c980998ef57b63a176f950ebe8d1ff1061ef0da1eb4a3a731414b705b9"

RPROVIDES:${PN} += "cmus-plugin-opus"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopusfile.so.0"

inherit rpm
