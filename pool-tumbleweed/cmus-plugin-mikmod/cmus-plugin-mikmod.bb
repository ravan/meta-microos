SUMMARY = "MikMod input plugin for the C* Music Player"
DESCRIPTION = "This package provides MikMod (tracker) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-mikmod-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "bd591d5f8025959261c2433ec246cf784aac3952d52d49c604361135545f6ce4627482a7fec4db8bf37cfe66272851a4c2fb238d3829f938fe50d7a252018622"

RPROVIDES:${PN} += "cmus-plugin-mikmod"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmikmod.so.3"

inherit rpm
