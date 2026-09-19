SUMMARY = "Server for distributed C/C++ compilation"
DESCRIPTION = "This package contains the compilation server needed to use distcc."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-server-3.4-6.7.aarch64.rpm"
RPM_HASH = "7da1b28396501dd01910b7b69781b459599535a7ffa00583981934a62fbf91f5e740f935524c3d4b48f22f34234b8e69f110ffd1ef0a13aab1688fe780bae871"

RPROVIDES:${PN} += "config-distcc-server \
distcc-server \
python3.13dist-include-server \
python3dist-include-server"

RDEPENDS:${PN} += "/usr/bin/sh \
distcc \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
systemd"

inherit rpm
