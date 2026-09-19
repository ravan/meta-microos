SUMMARY = "Development files for the EchoLink"
DESCRIPTION = "Development files for the EchoLink communications library"
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "libecholib-devel-1.3.7-7.1.aarch64.rpm"
RPM_HASH = "e64aa0668b8e3b093ac71b2a590306a12cf3c02b54e4c750e13532a1d169ee375869408bca9c04ac69939c9dcf35a7756d450afd92644813e9a2a8816482df15"

RPROVIDES:${PN} += "libecholib-devel"

RDEPENDS:${PN} += "libecholib1-3"

inherit rpm
