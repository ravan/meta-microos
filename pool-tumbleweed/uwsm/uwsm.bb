SUMMARY = "Universal Wayland Session Manager"
DESCRIPTION = "Wraps standalone Wayland compositors into a set of Systemd units on the fly. \
This provides robust session management including environment, XDG autostart \
support, bi-directional binding with login session, and clean shutdown."
LICENSE = "MIT"

PV = "0.26.7"

RPM_NAME = "uwsm-0.26.7-1.1.noarch.rpm"
RPM_HASH = "0e8464fadce46c1fc909975a46e4efec511689b84f908bb76941e6866fb75776ce06a09562ee76dcbcc6a9781444e30cec4b97f69723265b75381e36837d38df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fumon \
uuctl \
uwsm \
uwsm-app \
uwsm-terminal \
uwsm-terminal-scope \
uwsm-terminal-service"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-base \
python3-dbus-python \
python3-pyxdg"

inherit rpm
