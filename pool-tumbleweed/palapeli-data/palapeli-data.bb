SUMMARY = "Palapeli's standard puzzle files"
DESCRIPTION = "This package contains the standard puzzle files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "palapeli-data-26.08.1-1.1.noarch.rpm"
RPM_HASH = "d72c031e5f6ccb3a556d7ce00362008e2951e225b65a0d66b9def797646fc38b16e0a3142d10988eddd50bd153fd746e774205b33eee554f7c241efabb9bfe8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-palapeli-data \
palapeli-data"

RDEPENDS:${PN} += "palapeli"

inherit rpm
