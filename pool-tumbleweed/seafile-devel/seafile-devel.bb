SUMMARY = "Development files for seafile"
DESCRIPTION = "The seafile-devel package contains libraries and header files for \
developing applications that use seafile."
LICENSE = "GPL-2.0-only"

PV = "9.0.21"

RPM_NAME = "seafile-devel-9.0.21-1.1.aarch64.rpm"
RPM_HASH = "e4f9268dc4207950482c04e5a30c77acc403931c117ae15bc33df8e067cbd12fa747e95113f30a760710dd1ee3fe2478629601090a4a81fb3937d9776c2663e4"

RPROVIDES:${PN} += "pkgconfig-libseafile \
seafile-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseafile0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
seafile"

inherit rpm
