SUMMARY = "Upstream branding of waybar"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "waybar-branding-upstream-0.15.0-1.8.noarch.rpm"
RPM_HASH = "2f4da061828475885ec5872446c106c4825e8935f2e9bd03f3393d2ec8c5c853ff95fc502af8ec65d8863488aeab71eb234d104757aec1de1aff754d0950088f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-upstream \
waybar-branding \
waybar-branding-upstream"

RDEPENDS:${PN} += "waybar"

inherit rpm
