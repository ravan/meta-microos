SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python314-dasbus-1.7-2.5.noarch.rpm"
RPM_HASH = "23efe8f38174fd6b696889e3d587c2d49087782208b4305212d5602a2f36e78d925f0437f2ce412e28522087f9cdaaadccda7559524e10a0e352eabb300c264f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dasbus \
python314-dasbus \
python3dist-dasbus"

RDEPENDS:${PN} += "python-abi \
python314-gobject \
typelib-GLib \
typelib-Gio"

inherit rpm
