SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python314-napalm-asa-20180525.8c54a85-1.13.noarch.rpm"
RPM_HASH = "c686ac5d7070e8df20b346fe651005bb091ca05ce927ce2f97ef659bfb1d6299542fe235d771de29f587b68537acfbcebd58117c0eedb53eb5cd8aa90bb453a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-napalm-asa \
python314-napalm-asa \
python3dist-napalm-asa"

RDEPENDS:${PN} += "python-abi \
python314-napalm"

inherit rpm
