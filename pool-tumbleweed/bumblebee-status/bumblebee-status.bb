SUMMARY = "Modular, theme-able status line generator for the i3 window manager"
DESCRIPTION = "bumblebee-status is a modular, themeable status line generator for the i3 window manager. \
It supports theming and does not require any configuration files. \
 \
You can use the mouse wheel up/down to switch workspaces forward and back everywhere throughout the bar."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-2.1.5-4.7.aarch64.rpm"
RPM_HASH = "c56537667e8265336d68a15fe9526a2e27e82efd966e976f146264d6a7923f0eb135dfe6ef92b568b3d2d7e407dbec6da6340ab918217022a8e61b563af16fae"

RPROVIDES:${PN} += "bumblebee-status"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1 \
i3 \
libX11.so.6 \
libc.so.6 \
psmisc \
python3 \
python3-dbus-python \
python3-netifaces \
python3-power \
python3-psutil \
python3-pytz \
python3-requests \
python3-tzlocal \
sudo \
xdg-utils"

inherit rpm
