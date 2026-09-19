SUMMARY = "The GNOME Display Manager -- openSUSE Aeon default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the openSUSE Aeon default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "20240324"

RPM_NAME = "gdm-branding-Aeon-20240324-1.7.noarch.rpm"
RPM_HASH = "b59b1d5b49887d218d11cce91d6f5a2d09c330052a5d3cf9b107e06231fd4c5f95be88d965d311cb274af1571c5d997ff6bc2faf05be4171b4b88e54e649da14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gdm-branding-Aeon \
gdm-branding \
gdm-branding-Aeon \
gdm-branding-MicroOS"

RDEPENDS:${PN} += "distribution-logos \
gdm"

inherit rpm
