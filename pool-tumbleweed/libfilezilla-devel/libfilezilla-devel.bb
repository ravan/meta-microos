SUMMARY = "Development package for libfilezilla"
DESCRIPTION = "Files needed for development with libfilezilla."
LICENSE = "GPL-2.0-or-later"

PV = "0.57.0"

RPM_NAME = "libfilezilla-devel-0.57.0-1.1.aarch64.rpm"
RPM_HASH = "116ec3340d21848cd4e912c72d5434cb16f4f08cec22187bc0e98965984e705553eb4de73615119bb1d83818d836e89c0009b2232a7aaacecfc9306ea1e249d0"

RPROVIDES:${PN} += "libfilezilla-devel \
pkgconfig-libfilezilla"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfilezilla59 \
pkgconfig-gnutls \
pkgconfig-hogweed \
pkgconfig-nettle"

inherit rpm
