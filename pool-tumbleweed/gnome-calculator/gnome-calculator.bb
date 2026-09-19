SUMMARY = "A GNOME Calculator Application"
DESCRIPTION = "A GNOME calculator package based on calctool and MP library."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+16"

RPM_NAME = "gnome-calculator-50.0+16-1.3.aarch64.rpm"
RPM_HASH = "fd6ade31053a9f3160daa6b50bee6a932f4b516f7f6a92bedee7dd5d76c5980708d9587b1f000bff1865309a08be04c0db57d3efd947a651d38f89268c473a42"

RPROVIDES:${PN} += "gnome-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libmpc.so.3 \
libmpfr.so.6 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
