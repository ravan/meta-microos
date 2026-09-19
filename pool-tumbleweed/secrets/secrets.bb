SUMMARY = "A password manager for GNOME"
DESCRIPTION = "Secrets is a password manager which makes use of the Keepass v.4 \
format. \
It integrates with the GNOME desktop and provides an interface for \
the management of password databases."
LICENSE = "GPL-3.0-only"

PV = "13.0.1"

RPM_NAME = "secrets-13.0.1-1.2.noarch.rpm"
RPM_HASH = "33d97c94c0fd596d9bc952a74c9f2f8537330e8da2a59e435ee295a8576a42fb0091f1613e26350883f71e4c36f90958213f80f43e68db3f037aeeffe4f7a739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-passwordsafe \
secrets"

RDEPENDS:${PN} += "/usr/bin/python3 \
opensc \
python-abi \
python3-PyKCS11 \
python3-argon2-cffi \
python3-gobject-Gdk \
python3-lxml \
python3-pycryptodome \
python3-pyhibp \
python3-pykeepass \
python3-pyotp \
python3-python-yubico \
python3-pyusb \
python3-validators \
python3-zxcvbn-rs-py \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Graphene \
typelib-Gtk \
typelib-GtkSource"

inherit rpm
