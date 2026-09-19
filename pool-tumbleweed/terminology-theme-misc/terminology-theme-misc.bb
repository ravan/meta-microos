SUMMARY = "Miscellaneous terminology themes"
DESCRIPTION = "Miscellaneous themes provided by the terminology devs, includes Solarized, \
Mild and Black themes."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-misc-1.13.0-1.13.aarch64.rpm"
RPM_HASH = "6a3b39f5bf67a8ede940b097cb07984d76bf10728be4ae4b731d3389618e4a472dbb88284d6f914593efaba18e2214a9351d02ddf695aa415873044782b9e982"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-misc"

RDEPENDS:${PN} += ""

inherit rpm
