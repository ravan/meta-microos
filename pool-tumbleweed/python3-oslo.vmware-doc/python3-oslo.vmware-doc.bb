SUMMARY = "Documentation for OpenStack common VMware library"
DESCRIPTION = "Documentation for OpenStack common VMware library."
LICENSE = "Apache-2.0"

PV = "4.10.1"

RPM_NAME = "python3-oslo.vmware-doc-4.10.1-1.1.noarch.rpm"
RPM_HASH = "36208d724b086c557ef82e579f6a68fed74166bd91fed189f9d189114b0c3f24b07cdda9ac6c40f697b49cc0de315570ec5a58a09d3aee59c012cf4555cbcc89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.vmware-doc"

RDEPENDS:${PN} += ""

inherit rpm
