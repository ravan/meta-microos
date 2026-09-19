SUMMARY = "Open vSwitch public key infrastructure dependency package"
DESCRIPTION = "openvswitch-pki provides PKI (public key infrastructure) support for \
Open vSwitch switches and controllers, reducing the risk of \
man-in-the-middle attacks on the Open vSwitch network infrastructure. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "openvswitch-pki-3.7.1-37.1.noarch.rpm"
RPM_HASH = "977658881824da2346222a5581d63628b7461153caa23020bded1818c966226376a4313804175a80ad22864088b39b11dc1ea3fa1cef8dd934739aae6f997733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-dpdk-pki \
openvswitch-pki"

RDEPENDS:${PN} += "/usr/bin/sh \
openssl-cli \
openvswitch"

inherit rpm
