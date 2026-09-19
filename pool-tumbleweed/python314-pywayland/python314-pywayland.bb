SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.17"

RPM_NAME = "python314-pywayland-0.4.17-3.12.aarch64.rpm"
RPM_HASH = "ee118b70e7e66fba7ceebccbfee8da544eaa5d90834cfac5a63e774da09bb4a87297cbfb36992c4da17a4e144386ac27a95d675ae935566bce4e210f6b02781d"

RPROVIDES:${PN} += "python3.14dist-pywayland \
python314-pywayland \
python3dist-pywayland"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
python-abi \
update-alternatives"

inherit rpm
