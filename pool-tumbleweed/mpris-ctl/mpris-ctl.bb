SUMMARY = "Basic mpris player control for linux command line"
DESCRIPTION = "Minimalistic cli tool for controlling audio players exposing a MPRIS \
DBus interface, targeted at keyboard based WMs."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "mpris-ctl-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "2bd5961ddc6a5f213ade7208870dec72d26daf0bad0bb1bb6964e25d0a94fcfc78e0ffb49dd4a4e1998ac85d1e97be0fb665235e9be22880f1fd8239824a7e67"

RPROVIDES:${PN} += "mpris-ctl"

RDEPENDS:${PN} += "libc.so.6 \
libdbus-1.so.3"

inherit rpm
