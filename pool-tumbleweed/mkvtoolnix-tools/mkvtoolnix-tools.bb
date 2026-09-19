SUMMARY = "Additional command line tools for mkv files"
DESCRIPTION = "This package contains extra command line tools for mkv diagnostic."
LICENSE = "GPL-2.0-or-later"

PV = "102.0"

RPM_NAME = "mkvtoolnix-tools-102.0-1.1.aarch64.rpm"
RPM_HASH = "1f639fb139587922ce7bb43446abdab3adfb62adad1b85fd9fe9e557c18ff6ef8f14d2b48f4c35c38a334996bf8d90d04688111fdf77d892029dafea5b48cb1e"

RPROVIDES:${PN} += "mkvtoolnix-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libebml.so.5 \
libfmt.so.12 \
libgcc-s.so.1 \
libgmp.so.10 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
