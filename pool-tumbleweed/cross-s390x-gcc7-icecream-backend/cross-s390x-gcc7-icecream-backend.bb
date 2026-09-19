SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "91debae7df70c3c9c0a83ffd0968af40d843c4671f89c0ea79da0fa3c2de85c875fcd68962f5ca157067f514f825c0a47bb70665ae77d6995cd0d7f223b63bc8"

RPROVIDES:${PN} += "cross-s390x-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
