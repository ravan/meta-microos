SUMMARY = "Moka Icon theme"
DESCRIPTION = "Moka is a simple and modern icon theme with Material Design influences."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "5.4.0"

RPM_NAME = "moka-icon-theme-5.4.0-1.12.noarch.rpm"
RPM_HASH = "17fc3176c070e27d187e95e1f301284a234364fd3b8b9aff0df31ffa2e6577c9cd428b73e23183c67f76578fc9e989c45535ae179420a681948c4bfe48557d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moka-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
