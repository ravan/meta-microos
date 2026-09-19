SUMMARY = "A glib/gio-based lib used to develop file managers"
DESCRIPTION = "A glib/gio-based library providing some file management utilities and \
related-widgets missing in gtk+/glib. This is the core of PCManFM. The \
library is desktop independent (not LXDE specific) and has clean API. \
It can be used to develop other applications requiring file management \
functionality. For example, you can create your own file manager with \
facilities provided by libfm."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libfm-extra4-1.3.1-2.4.aarch64.rpm"
RPM_HASH = "65231022f61c0af146b0d4b93a69128e115e807a78aa8492e0a1ea28969fd758f0e78489f4f24c2956af6ff03b74584ddf2bb31c13b9ae45ce976b2fa0a99fe7"

RPROVIDES:${PN} += "libfm-extra.so.4 \
libfm-extra4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
