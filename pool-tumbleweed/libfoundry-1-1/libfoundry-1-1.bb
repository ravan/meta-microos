SUMMARY = "IDE library and command-line companion tool"
DESCRIPTION = "This tool aims to extract much of what makes GNOME Builder an IDE into a \
library and companion command-line tool."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & Apache-2.0"

PV = "1.1.1"

RPM_NAME = "libfoundry-1-1-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "55d6842721b97bccc318f2dceaa8725bd5809e50cd2ed86378a4391a9539821ad373cea31d884e6466a20ed14a270a6cb747c39e8eb0eb611e1d53ef52d3368e"

RPROVIDES:${PN} += "libfoundry-1-1 \
libfoundry-1.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdex-1.so.1 \
libeditorconfig.so.0 \
libflatpak.so.0 \
libgio-2.0.so.0 \
libgit2.so.1.9 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgom-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpeas-2.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libtemplate-glib-1.0.so.0 \
libxml2.so.16 \
libyaml-0.so.2"

inherit rpm
