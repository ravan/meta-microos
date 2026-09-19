SUMMARY = "Gtk#-based Hex-editor written in C#"
DESCRIPTION = "Bless is a hex editor written in Mono/Gtk#. It features: \
 \
* Efficient editing of large data files and block devices. \
* Multilevel undo - redo operations. \
* Customizable data views. \
* Multiple tabs. \
* A data conversion table. \
* Advanced copy/paste capabilities. \
* Highlighting of selection pattern matches in the file. \
* Plugin-based architecture. \
* Export of data to text and HTML (others with plugins). \
* Bitwise operations on data."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "bless-0.6.3-3.3.aarch64.rpm"
RPM_HASH = "d6e4ead10647f21c8183511e16cd1ffb8e092dd96882ed580eaacb3ff879a22ce03bb2cd23ac7831fbfcf13d91b3cce82e70786fba02b273a0d3f6a1cd45434f"

RPROVIDES:${PN} += "bless \
mono-Bless.Buffers \
mono-Bless.Gui \
mono-Bless.Gui.Areas \
mono-Bless.Gui.Areas.Plugins \
mono-Bless.Gui.Drawers \
mono-Bless.Gui.Plugins \
mono-Bless.Plugins \
mono-Bless.Tools \
mono-Bless.Tools.Export \
mono-Bless.Tools.Export.Plugins \
mono-Bless.Tools.Find \
mono-Bless.Util \
mono-bless"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-Mono.Posix \
mono-System \
mono-System.Xml \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
mono-pango-sharp"

inherit rpm
