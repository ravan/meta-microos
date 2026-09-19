SUMMARY = "Pure Javascript SPICE client"
DESCRIPTION = "spice-html5 is a Javascript SPICE client.  This includes a simple HTML \
page to initiate a session, and the client itself.  It includes a configuration \
file for Apache, but should work with any web server."
LICENSE = "LGPL-3.0-only"

PV = "0.3.0"

RPM_NAME = "spice-html5-0.3.0-1.10.noarch.rpm"
RPM_HASH = "b2f56a3b30f38b62f4be2778a650f8e6a1c6d444d5301fbb6bffba0f63042f1f3bc799923b8ed870ab0287910ba669fe39c035d2bc77294c6c851a66f78332d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spice-html5"

RDEPENDS:${PN} += ""

inherit rpm
