SUMMARY = "The GNOME Display Manager -- Upstream default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the upstream default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gdm-branding-upstream-50.3-1.1.noarch.rpm"
RPM_HASH = "a224a788703d5c356ba149e6c550b58fad54c76e563f4f64f1585f25cdc09faf2d3a7e114932dae90917caf5031b44fb13096802a052e07d298b159ed6cedd66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gdm-branding-upstream \
gdm-branding \
gdm-branding-upstream"

RDEPENDS:${PN} += "gdm"

inherit rpm
