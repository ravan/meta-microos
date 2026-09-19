SUMMARY = "Network configuration infrastructure - nbft support"
DESCRIPTION = "This package provides an extension to retrieve the NBFT firmware \
network interface configuration according to the NVM Express Boot \
Specification 1.0 and convert it to wicked configuration."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.80"

RPM_NAME = "wicked-nbft-0.6.80-2.1.aarch64.rpm"
RPM_HASH = "da70aa1bfff53236b49d8cb7330f120d1e1257f15c57635fb1fbce9a19ef9e998cabd03784f0216c010b53107166746dc1bae71671fe35733c8ad9c673e19a07"

RPROVIDES:${PN} += "wicked-nbft"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
jq \
nvme-cli \
wicked"

inherit rpm
