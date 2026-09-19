SUMMARY = "Backup tool for Linux inspired by the 'flyback project'"
DESCRIPTION = "Back In Time is a backup tool for Linux inspired by the 'flyback project'. \
 \
It provides a command line client 'backintime' and a Qt5 GUI 'backintime-qt' \
both written in Python3. \
 \
You only need to specify 3 things: \
    * where to save snapshots; \
    * what folders to backup; and \
    * backup frequency (manual, every hour, every day, every month)."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.1"

RPM_NAME = "backintime-1.6.1-1.2.noarch.rpm"
RPM_HASH = "5eabd05f07eaf36f5b98790b9cf846913830877b298313bddb42c767886e2a99438bb212f032eee5c94931140d5c2caca1a3d2f8606de78628aabb2d9ffcd7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "backintime \
backintime-doc \
config-backintime"

RDEPENDS:${PN} += "/usr/bin/sh \
openssh \
pkexec \
python3 \
python3-dbus-python \
python3-keyring \
python3-packaging \
rsync"

inherit rpm
