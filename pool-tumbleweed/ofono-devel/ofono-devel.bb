SUMMARY = "Development files for ofono, a mobile telephony framework"
DESCRIPTION = "oFono provides a mobile telephony (GSM/UMTS) application development \
framework. It includes a high-level D-Bus API for use by telephony \
applications, and a low-level plug-in API. \
 \
This subpackage contains the header files for developing \
applications that want to make use of ofono."
LICENSE = "GPL-2.0-only"

PV = "2.19"

RPM_NAME = "ofono-devel-2.19-3.3.aarch64.rpm"
RPM_HASH = "611e4b01bfe8d665c9de1956c4583457afce958f521b0a61c1704c98c3dffb1cec229f78e42ba81090e34dd6b3a1ff8e504c9bfbe2563f409d56381c2c0a79af"

RPROVIDES:${PN} += "ofono-devel \
pkgconfig-ofono"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ofono \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0"

inherit rpm
