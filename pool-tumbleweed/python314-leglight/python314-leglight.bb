SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-leglight-0.2.0-2.5.aarch64.rpm"
RPM_HASH = "bbc8aef9bcd4962e20db7055671cc4c587ab71a08423ea585acc80833bb2b3484a12b5b9f4eea1fef1e55060255959b7daf91809a1bc67b7463167f3ea8fa0fd"

RPROVIDES:${PN} += "python3.14dist-leglight \
python314-leglight \
python3dist-leglight"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-zeroconf"

inherit rpm
