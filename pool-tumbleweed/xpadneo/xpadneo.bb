SUMMARY = "Driver for Xbox Wireless Controller"
DESCRIPTION = "Advanced Linux Driver for Xbox One Wireless Controller (shipped with Xbox One S)"
LICENSE = "GPL-3.0-only"

PV = "0.10.1"

RPM_NAME = "xpadneo-0.10.1-1.25.aarch64.rpm"
RPM_HASH = "52992db19decc25caf0b7684d8939d6a600642fa66c3c9fdb48553b0084da73cdbc1348815be0f829c8915fdf54665b662d4b225b3a9aa0b1ba5604b47525721"

RPROVIDES:${PN} += "xpadneo"

RDEPENDS:${PN} += "xpadneo-kmp"

inherit rpm
