SUMMARY = "The GNOME Display Manager -- openSUSE MicroOS default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the openSUSE default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "20190625"

RPM_NAME = "gdm-branding-MicroOS-20190625-1.18.noarch.rpm"
RPM_HASH = "0d1e0dd05bfbe15f0971b6a75c3d4c8b4231acb124cc3cb5ffff6cda4c9cc9216830a63bd26dafcf81c0e8a0fc3cf13e7e161b570d4c88fd947e8d4fddf5ae88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gdm-branding-MicroOS \
gdm-branding \
gdm-branding-MicroOS"

RDEPENDS:${PN} += "distribution-logos \
gdm"

inherit rpm
