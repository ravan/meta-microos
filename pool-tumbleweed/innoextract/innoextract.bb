SUMMARY = "A tool to extract Inno Setup installers under non-windows systems"
DESCRIPTION = "Inno Setup is a tool to create installers for Microsoft Windows \
applications. Inno Extracts allows to extract such installers under \
non-windows systems without running the actual installer using wine. Inno \
Extract currently supports installers created by Inno Setup 1.2.10 to \
5.4.3."
LICENSE = "Zlib"

PV = "1.9"

RPM_NAME = "innoextract-1.9-4.8.aarch64.rpm"
RPM_HASH = "269d944844ce0bf3bc909c276c9932cdba26e0d5e82d8deb0487d0f7f065d2c94b01a465820a5be563f63509e9c80505359d92d8cc83872c72220ea905db19ba"

RPROVIDES:${PN} += "innoextract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
