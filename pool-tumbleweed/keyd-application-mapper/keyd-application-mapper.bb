SUMMARY = "Application mapper for keyd"
DESCRIPTION = "Application mapper for keyd"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "keyd-application-mapper-2.6.0-2.1.aarch64.rpm"
RPM_HASH = "726a65798c3010c20816dbacd4c94df104f682d43e9c1ddc37b3308c23c5cf5b7617dbcd83a988a3f38188da5528aea11a4360921c9123495c46288641960c9d"

RPROVIDES:${PN} += "keyd-application-mapper"

RDEPENDS:${PN} += "/usr/bin/python3 \
keyd \
python3-dbus-python \
python3-gobject \
python3-xlib"

inherit rpm
