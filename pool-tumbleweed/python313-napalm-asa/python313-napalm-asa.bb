SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python313-napalm-asa-20180525.8c54a85-1.13.noarch.rpm"
RPM_HASH = "e2c9834d99515a10c88a6e94e30de338bf12b7e79d43fc2f84ac22a60adb3ddf884e24fdddcf25950d1c1ed7a00d01231d40a8b9b82a8fd19c3f87a69e55f8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-asa \
python3.13dist-napalm-asa \
python313-napalm-asa \
python3dist-napalm-asa"

RDEPENDS:${PN} += "python-abi \
python313-napalm"

inherit rpm
