SUMMARY = "Modplug input plugin for the C* Music Player"
DESCRIPTION = "This package provides modplug (tracker) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-modplug-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "b27518e3c5a9d1836bab16da3dee9eef33d94c443734e8c5956ff22b781f09631e2aa7dfe045b8885ef2fd5652a4de60fd94ea047502840f79dda679c64a97c5"

RPROVIDES:${PN} += "cmus-plugin-modplug"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmodplug.so.1"

inherit rpm
