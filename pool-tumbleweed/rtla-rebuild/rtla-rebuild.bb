SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "rtla-rebuild-7.2.5-8.105.aarch64.rpm"
RPM_HASH = "6e149e22c6983da917106adadd8b1a5ecfc34b0650ee8572605776b45ede7c9c2c706b0a490db99c34ee849e0bdbe950ce617f97d5b995dd6e1e3c2309045e7f"

RPROVIDES:${PN} += "rtla-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
