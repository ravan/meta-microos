SUMMARY = "Upstream branding of lightdm-kde-greeter"
DESCRIPTION = "This package provides the upstream look and feel for lightdm-kde-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.5"

RPM_NAME = "lightdm-kde-greeter-branding-upstream-6.0.5-1.4.noarch.rpm"
RPM_HASH = "57c68dce8d6d15abecb422d583ead5b2783219d72f6f5331fd54a834972d73eb69ce31ace7c2548ce34d268879faacc0320c63810bfc86111040e4182722db3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lightdm-kde-greeter-branding-upstream \
lightdm-kde-greeter-branding \
lightdm-kde-greeter-branding-upstream"

RDEPENDS:${PN} += "lightdm-kde-greeter"

inherit rpm
