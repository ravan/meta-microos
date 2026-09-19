SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python313-dasbus-1.7-2.5.noarch.rpm"
RPM_HASH = "b2a0278d82af89d4ccbd618e552065ad04a7e1398ea53d03df2dfeaba50d718f6fd7b9fc706544604cdb2819097d4449305f11d29ff7afa049c9eba6fe23d888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dasbus \
python3.13dist-dasbus \
python313-dasbus \
python3dist-dasbus"

RDEPENDS:${PN} += "python-abi \
python313-gobject \
typelib-GLib \
typelib-Gio"

inherit rpm
