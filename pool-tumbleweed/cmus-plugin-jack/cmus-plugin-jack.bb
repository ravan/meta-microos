SUMMARY = "JACK output plugin for the C* Music Player"
DESCRIPTION = "This package provides JACK output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-jack-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "13db413ab11808de709b8d06f4a424093757d6a4a78884154322e960b6fbba74945c9e76d5e8b0053f4d1d7c34df205c8d0dcfa32518e6c1c1f87f56db3f6e49"

RPROVIDES:${PN} += "cmus-plugin-jack"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
libsamplerate.so.0"

inherit rpm
