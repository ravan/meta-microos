SUMMARY = "This package contains all things experimental for composefs"
DESCRIPTION = "This package contains all things experimental for composefs."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "composefs-experimental-1.0.8-3.11.aarch64.rpm"
RPM_HASH = "ec22313d8617cdb93a3bbf92efb4c653a2d90397b51d8e3249b7b66c70770939a16c700f23c31d612dadc005dd73fd64cb5da0d9eede71e5fb940474b07dd0f2"

RPROVIDES:${PN} += "composefs-experimental"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcomposefs.so.1 \
libfuse3.so.4"

inherit rpm
