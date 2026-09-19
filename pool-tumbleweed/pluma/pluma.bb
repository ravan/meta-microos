SUMMARY = "Text editor for the MATE desktop"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window. \
 \
Pluma is extensible through a plugin system, which currently \
includes support for spell checking, comparing files, viewing VCS \
ChangeLogs, and adjusting indentation levels."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "pluma-1.28.1-1.3.aarch64.rpm"
RPM_HASH = "313dcac0aa1e901f9dd6f140b017d851ad8fdecdd193f3bc61523087b9370834b42fd920aed57ba2606422e16846e4df01d7adba1ba20ec104b819987891980f"

RPROVIDES:${PN} += "libdocinfo.so \
libfilebrowser.so \
libmodelines.so \
libsort.so \
libspell.so \
libtaglist.so \
libtime.so \
libtrailsave.so \
pluma"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libmate-desktop-2.so.17 \
libpango-1.0.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
libxml2.so.16 \
mate-desktop-gsettings-schemas \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-Peas \
typelib-PeasGtk \
typelib-Pluma"

inherit rpm
