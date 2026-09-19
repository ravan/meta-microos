SUMMARY = "Icons for Pyzo"
DESCRIPTION = "Icons used by pyzo"
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "pyzologo-4.11.2-2.5.noarch.rpm"
RPM_HASH = "184069e38f014332f66a3c3101010437caeba874d1be134080359d31f4c377fd05a82c26ae03e22876ebea6233c36ffe028da0d5766854be573590ea90b12453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyzologo"

RDEPENDS:${PN} += ""

inherit rpm
