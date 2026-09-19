SUMMARY = "The GNOME Display Manager -- openSUSE default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the openSUSE default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "gdm-branding-openSUSE-15.1-4.2.noarch.rpm"
RPM_HASH = "ae023b3f93b6ffaa1ef07146486ee74725275b931f8edb669e9d5a9743f65916b05d1e7adcdb75d40edc5e8ed4ceada9c3f4147087ce5a25df52fc2c8b2c0df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gdm-branding-openSUSE \
gdm-branding \
gdm-branding-openSUSE"

RDEPENDS:${PN} += "distribution-logos \
gdm"

inherit rpm
