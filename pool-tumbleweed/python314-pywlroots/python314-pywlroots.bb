SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.17.0"

RPM_NAME = "python314-pywlroots-0.17.0-1.11.aarch64.rpm"
RPM_HASH = "133d6d866106c55483963feb678146ed545a880780f60fed1c173492120ca78fdae6b7a751bdbff2d692c28a5270508a2c356dae237a01b9a8792b677312ba83"

RPROVIDES:${PN} += "python3.14dist-pywlroots \
python314-pywlroots \
python3dist-pywlroots"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwlroots.so.12 \
python-abi \
python314-pywayland \
python314-xkbcommon"

inherit rpm
