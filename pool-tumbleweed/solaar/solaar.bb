SUMMARY = "Linux devices manager for the Logitech Unifying Receiver"
DESCRIPTION = "Solaar will detect all devices paired with your Unifying Receiver, and \
at the very least display some basic information about them. \
 \
For some devices, extra settings (usually not available through the \
standard Linux system configuration) are supported. For a full list of \
supported devices and their features, see docs/devices.md."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.20"

RPM_NAME = "solaar-1.1.20-1.1.noarch.rpm"
RPM_HASH = "1dafe71067810c4d26b890a11cb15de21d28765c20fdb993c3f61975b969bcd9d061a0397a711fd22f0af102c520967cfab44abb479c66e164e3e9e91f3f239b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-solaar \
python3dist-solaar \
solaar \
solaar-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
libappindicator-gtk3 \
python-abi \
python3-PyYAML \
python3-dbus-python \
python3-evdev \
python3-gobject \
python3-gobject-Gdk \
python3-hid-parser \
python3-psutil \
python3-pyudev \
python3-typing-extensions \
solaar-udev \
typelib-AyatanaAppIndicator3 \
typelib-Gtk"

inherit rpm
