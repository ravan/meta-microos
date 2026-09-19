SUMMARY = "The MATE Control Center -- Upstream Definition of Shell Content"
DESCRIPTION = "The control center is MATE's main interface for configuration of \
various aspects of your desktop. \
 \
This package provides the upstream definition of what appears in the \
control center."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-control-center-branding-upstream-1.28.0-1.11.noarch.rpm"
RPM_HASH = "ded80213193d3b657daf0184ea4118c0235ff889491e6dad33203420d588c4cef3adb1b99484db71b041e56287902e3bfb8990ee5145cf275f5692f5752ee672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mate-control-center-branding-upstream \
mate-control-center-branding \
mate-control-center-branding-upstream"

RDEPENDS:${PN} += "mate-control-center"

inherit rpm
