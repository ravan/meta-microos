SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python314-notify2-0.3.1-6.5.noarch.rpm"
RPM_HASH = "b33844f881ca9c6c5b7e15bd9efd91fe01535ddd53c92117d51fa4b6cbcaeb3e4c76d93f8b827c9f7fc045367efdbe5fd58de9ad5b3de41dd5c8cb92efac5f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-notify2 \
python314-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python314-dbus-python"

inherit rpm
