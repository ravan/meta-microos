SUMMARY = "LUKS integration for Clevis"
DESCRIPTION = "LUKS integration for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-luks-21-1.6.aarch64.rpm"
RPM_HASH = "9a5112ba7f08405d47cce8e6a0b174d51398474c7f6abd6e9237ead98dcb80dd2773575b3bcdba8cbdcc8aa3555ba33caefaed3ae05a167f03accf8040f9e23e"

RPROVIDES:${PN} += "clevis-luks"

RDEPENDS:${PN} += "/usr/bin/bash \
clevis \
cryptsetup \
libpwquality-tools"

inherit rpm
