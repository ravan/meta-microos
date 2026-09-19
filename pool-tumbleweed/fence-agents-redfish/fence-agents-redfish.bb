SUMMARY = "Fence agent for Redfish"
DESCRIPTION = "The fence-agents-redfish package contains a fence agent for Redfish"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-redfish-4.17.0+git.1786356985.d90bec5f-1.1.aarch64.rpm"
RPM_HASH = "5f1c5b0ea52ac604f405f95dde752dc2dfc56d165e95e2ab116a3de71beeacf0d80c84e20cf09b35a83f4f83110f1713660d122e809cd420c88f59102a54e310"

RPROVIDES:${PN} += "fence-agents-redfish"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3-requests"

inherit rpm
