SUMMARY = "Default baseset graphics for OpenTTD"
DESCRIPTION = "OpenGFX is an open source graphics base set designed to be used by OpenTTD. \
 \
OpenGFX provides a set of free and open source base graphics, and aims to \
ensure the best possible out-of-the-box experience with OpenTTD."
LICENSE = "GPL-2.0-only"

PV = "8.0"

RPM_NAME = "openttd-opengfx-8.0-1.3.noarch.rpm"
RPM_HASH = "7f671fbb42e58c53871b3ec51869402ff06dd8ce281992f9698801e4c909a67718ac3947ea8a8709071a19566ac03bbe67d3d98e5f36ea44cbbcdb8f928ed604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengfx \
openttd-opengfx"

RDEPENDS:${PN} += "openttd-data"

inherit rpm
