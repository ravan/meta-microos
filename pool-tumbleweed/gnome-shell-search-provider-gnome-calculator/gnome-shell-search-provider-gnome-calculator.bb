SUMMARY = "GNOME Calculator -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Calculator."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+16"

RPM_NAME = "gnome-shell-search-provider-gnome-calculator-50.0+16-1.3.aarch64.rpm"
RPM_HASH = "03c250cd1015bab31f107b0ba963acbeba182982ace2e3ca2fb24e92429f5b0951bb9977d1c6cb139d4c8a7b50f0bdd69f9e6623d9c0a3eef40b70e3913f1298"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-calculator"

RDEPENDS:${PN} += "gnome-calculator \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libmpc.so.3 \
libmpfr.so.6 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
