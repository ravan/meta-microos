SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python313-napalm-procurve-0.7.0-8.5.noarch.rpm"
RPM_HASH = "02cc8492abf04ec124349adb27f88b0bca43ef91020f4719f422ed183a6eddd6b3de6a1e5fb94da81d65e448e2e4cd3cc83fd4c694dea1e15465b9d3cfcc41e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-procurve \
python3.13dist-napalm-procurve \
python313-napalm-procurve \
python3dist-napalm-procurve"

RDEPENDS:${PN} += "python-abi \
python313-napalm \
python313-netmiko"

inherit rpm
