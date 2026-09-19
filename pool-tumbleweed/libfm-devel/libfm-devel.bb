SUMMARY = "Devel files for libfm"
DESCRIPTION = "A glib/gio-based lib used to develop file managers providing some \
file management utilities and related-widgets missing in gtk+/glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libfm-devel-1.4.1-2.5.aarch64.rpm"
RPM_HASH = "7173065435c47b4d101fb508a668d566b485f756c48015a8022a9d6caaee29ac562f12c418e856c73daa113f13c1e7d481d0077e98549026ff67135a514fa1f1"

RPROVIDES:${PN} += "libfm-devel \
pkgconfig-libfm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm \
libfm4 \
pkgconfig \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libfm-extra"

inherit rpm
