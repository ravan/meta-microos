SUMMARY = "A commandline web screenshot and information gathering tool"
DESCRIPTION = "A commandline web screenshot and information gathering tool."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "gowitness-3.2.0-1.1.aarch64.rpm"
RPM_HASH = "15c8adf4d47173f11dd065f05a122fa7cbb15a41e72e866462b14c8ab4705c6a26075fe8cf2e19f8e2e2be0930293b920b7ad4ded509a9c21340d0248a225228"

RPROVIDES:${PN} += "gowitness"

RDEPENDS:${PN} += ""

inherit rpm
