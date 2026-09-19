SUMMARY = "Python module for osdlyrics"
DESCRIPTION = "This package contains python3 module for osdlyrics"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "python3-osdlyrics-0.5.15-4.4.aarch64.rpm"
RPM_HASH = "958c904cc8797b59127e0226b4e064bac8b936def4585156357da1517ab17ba0a913bc1b360df661e7aa84d5c102902c931ad62af8098d278dd4867daac3662f"

RPROVIDES:${PN} += "python3-osdlyrics"

RDEPENDS:${PN} += "osdlyrics \
python-abi"

inherit rpm
