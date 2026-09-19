SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python314-napalm-procurve-0.7.0-8.5.noarch.rpm"
RPM_HASH = "430aa274d247819d3124543712ec02565c56999c14071b671f0ee8780ec20d552b07bb3547a1df96906822a3950cf72d3c4954beec65537b362567a19074b865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-napalm-procurve \
python314-napalm-procurve \
python3dist-napalm-procurve"

RDEPENDS:${PN} += "python-abi \
python314-napalm \
python314-netmiko"

inherit rpm
