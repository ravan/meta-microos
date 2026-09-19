SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-leglight-0.2.0-2.5.aarch64.rpm"
RPM_HASH = "b732e9a4fbf069245d21d5e461a41d347a12f78b40c46e12c94a2fdbf3b9797e121816c27348e214205cfb52bc0b820ca119a50e60b980cfb9b28b13aac71109"

RPROVIDES:${PN} += "python3-leglight \
python3.13dist-leglight \
python313-leglight \
python3dist-leglight"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-zeroconf"

inherit rpm
