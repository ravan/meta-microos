SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python313-notify2-0.3.1-6.5.noarch.rpm"
RPM_HASH = "32517d9e7b38fdf888241715dcfe42969b8165553caef40be002bb79ef1ea157551e288bfa90f93e61acdc345714e590abc635ec18cf50eaa4275a2f33306b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notify2 \
python3.13dist-notify2 \
python313-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python313-dbus-python"

inherit rpm
