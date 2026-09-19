SUMMARY = "Shepherd's init binaries"
DESCRIPTION = "Binaries of shepherd conflicting with other init systems. \
BuildArch:      noarch"
LICENSE = "GPL-3.0-or-later"

PV = "0.10.2"

RPM_NAME = "shepherd-bins-0.10.2-1.10.aarch64.rpm"
RPM_HASH = "e8f98b2a3a7be988d84610b25bf40585b9dac70540301f860dd44e250dab42afe0f36fa448cfd6b4d4dafc56a4fc4db53e73379777873d07a429bf3805b6c441"

RPROVIDES:${PN} += "/sbin/shutdown \
shepherd-bins"

RDEPENDS:${PN} += "/usr/bin/guile"

inherit rpm
