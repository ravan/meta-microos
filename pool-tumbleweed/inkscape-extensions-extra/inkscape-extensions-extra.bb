SUMMARY = "Additional extensions for Inkscape"
DESCRIPTION = "Extra extensions for Inkscape. Recommended for everybody who wants to \
use Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.4.4+git2.3454cb1dab"

RPM_NAME = "inkscape-extensions-extra-1.4.4+git2.3454cb1dab-1.2.aarch64.rpm"
RPM_HASH = "b3a0bbe21bb002d9a6f94e031d1286b0e023a93bb9a6249432d98f9fa4d847cd3b8784becc7691784aab1e3c3d0f4e79bb5c1ff468384ab3f9cfe564309a262c"

RPROVIDES:${PN} += "inkscape-extensions-extra"

RDEPENDS:${PN} += "ghostscript \
inkscape \
python3-appdirs \
python3-lxml \
python3-numpy \
python3-scour \
python3-tinycss2 \
python3-xml \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Pango"

inherit rpm
