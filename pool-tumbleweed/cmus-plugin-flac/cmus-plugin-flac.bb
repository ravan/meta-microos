SUMMARY = "FLAC input plugin for the C* Music Player"
DESCRIPTION = "This package provides FLAC input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-flac-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "9eb3006411d190ffea19d8715ac2ff4252bfdc54f96e121e2a83bfe6186f0ac39b91c2c196bf8c1c1223ed0b6d203f320caee4fbcc9a4b9f062fe523e32dec72"

RPROVIDES:${PN} += "cmus-plugin-flac"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6"

inherit rpm
