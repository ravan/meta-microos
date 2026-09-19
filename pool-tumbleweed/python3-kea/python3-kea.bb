SUMMARY = "Python interface to Kea DHCP server"
DESCRIPTION = "Python3 interface to ISC Kea DHCP server."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python3-kea-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "d18468c5aa27c588c7f7e7cf3f1a09fb61ead2152431255c35ebe7c238e999ee9afdf457fd4d10b9033d8c9e793f490cd94e7933143401d5d6bdd7c4ee8f2add"

RPROVIDES:${PN} += "python3-kea"

RDEPENDS:${PN} += "python-abi"

inherit rpm
