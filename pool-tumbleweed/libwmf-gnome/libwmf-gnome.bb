SUMMARY = "GNOME plugin for displaying and Converting Metafile Images"
DESCRIPTION = "This library interprets metafile images and can either display them \
using the X Window System or convert them to standard formats such as \
PNG, JPEG, PS, EPS, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.15"

RPM_NAME = "libwmf-gnome-0.2.15-1.3.aarch64.rpm"
RPM_HASH = "095c22a97ed506532a31510ff0f533077484f6f958b82efd787c849c8f556c100015d1ab870a254abfa7dfb280879e51e26e8d885dc112b5b3b8d1a308490a46"

RPROVIDES:${PN} += "libwmf-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7"

inherit rpm
