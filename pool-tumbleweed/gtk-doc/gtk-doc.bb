SUMMARY = "GTK+ Documentation Generator"
DESCRIPTION = "Gtkdoc is a set of Python scripts that generates API reference \
documentation in e.g DocBook, HTML or PDF format.  It can extract \
documentation from source code comments in a manner similar to \
Java-doc.  It is used to generate the documentation for GLib, \
Gtk+, and GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "gtk-doc-1.36.1-1.2.aarch64.rpm"
RPM_HASH = "e373bd83260efa95a1a20c55c70e5e009ab3e0e4ea227b1e6640e54c82908b5668b576310154672562fbc065334cc4487ba2edec10b25d5b9d08aa0337a76b24"

RPROVIDES:${PN} += "gtk-doc \
gtkdoc \
pkgconfig-gtk-doc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
/usr/bin/sh \
docbook-4 \
docbook-xsl-stylesheets \
glib2-devel \
libxml2-tools \
python3-pygments \
xsltproc"

inherit rpm
