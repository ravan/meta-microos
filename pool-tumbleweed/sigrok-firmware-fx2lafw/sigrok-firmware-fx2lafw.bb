SUMMARY = "Firmware for Logic Analyzers based on the Cypress EZ-USB FX2(LP) Chip"
DESCRIPTION = "fx2lafw is a free/libre/open-source firmware for logic analyzers based on \
the Cypress EZ-USB FX2(LP) chip."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.7+git20240203.0f2d324"

RPM_NAME = "sigrok-firmware-fx2lafw-0.1.7+git20240203.0f2d324-1.7.noarch.rpm"
RPM_HASH = "44ae6063ee3541fff62bed3c0647b1b224fe4d5f55c1c5b9949c35556393456083e752e38454c1946e2575e8e8dc4a296ea186e27e1274ab11ddcf953670b9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sigrok-firmware-fx2lafw"

RDEPENDS:${PN} += ""

inherit rpm
