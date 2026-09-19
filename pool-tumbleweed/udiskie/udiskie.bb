SUMMARY = "Removable disk automounter for udisks"
DESCRIPTION = "udiskie is a UDisks front-end that allows to manage removeable media such as CDs \
or flash drives from userspace. Its features include: \
 \
- automount removable media when inserted \
- notifications (on insertion, mount, unmount, …) \
- GTK tray icon to manage all available devices \
- command line tools for manual un-/mounting \
- support for LUKS encrypted devices \
- password caching \
- works with either udisks1 or udisks2 \
- an extensible code base (python) \
- a maintainer who is open for suggestions;)"
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "udiskie-2.6.1-1.2.noarch.rpm"
RPM_HASH = "6b93b1844f004610c895505324ec3635cfe77ade57b23cf0c98fb24b9f4a6eb26c859c5e6c0d041100dd4bde3aa2d1d24446641991201ae37e1c170807386a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-udiskie \
python3dist-udiskie \
udiskie"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gdk-pixbuf-loader-rsvg \
python-abi \
python3-PyYAML \
python3-docopt \
python3-gobject \
python3-setuptools \
python3-xml \
typelib-AppIndicator3 \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
udisks2"

inherit rpm
