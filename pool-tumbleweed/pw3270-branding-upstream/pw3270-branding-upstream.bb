SUMMARY = "Upstream branding for pw3270"
DESCRIPTION = "GTK-based IBM 3270 terminal emulator with many advanced features. It can be used to communicate with any IBM host that supports 3270-style connections over TELNET. \
 \
This package contains the upstream branding for pw3270."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20241211"

RPM_NAME = "pw3270-branding-upstream-5.5.0+git20241211-3.6.noarch.rpm"
RPM_HASH = "37e48b7ed08963951474edf29b5a5900531282d809c1aef8e79d45e42757bce09dc5071f06da8984b3ffc89b2d75fe8fb44115ccbe8baa8e67ba7f5e2db3030c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pw3270-branding \
pw3270-branding-upstream"

RDEPENDS:${PN} += "desktop-file-utils \
pw3270"

inherit rpm
