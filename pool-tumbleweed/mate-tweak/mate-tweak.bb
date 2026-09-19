SUMMARY = "MATE desktop tweak tool"
DESCRIPTION = "Configures some aspects of the MATE desktop not exposed via the \
MATE Control Centre applets. \
 \
Settings that can be handled via MATE Tweak: \
 * Show/hide standard desktop icons. \
 * Panel fine-tuning (icon visibility, in menus and on buttons, \
   icon size, button labelling, contex menus, etc.). \
 * Window manager fine-tuning."
LICENSE = "GPL-2.0-or-later"

PV = "22.10.0"

RPM_NAME = "mate-tweak-22.10.0-2.5.noarch.rpm"
RPM_HASH = "04f23f02bbbcd34d19c5ad336b3fdfec0b583e4566e6dfe5d727ffcac02c3fe5d69fe213a879a629c0049860c081ef2c5a087f9d09fb927791b12f46aef14705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-tweak \
python3.13dist-mate-tweak \
python3dist-mate-tweak"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.13 \
Mesa-demo-x \
dconf \
mate-panel \
python3-base \
python3-configobj \
python3-distro \
python3-gobject \
python3-gobject-Gdk \
python3-psutil \
python3-setproctitle \
python3-setuptools \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
xdg-utils"

inherit rpm
