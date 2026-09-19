SUMMARY = "Displays the VPN profile"
DESCRIPTION = "Displays the VPN profile that is currently in use."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-vpn-2.1.5-4.7.noarch.rpm"
RPM_HASH = "aab9bcf624d5b58211bf31433d00cf169c3561dfb0c1a5d9f9809290a16c9091faa86d42db4d5a6a7b9391ab59b4f0c16d1dfdcf289a19afb2ff56344bdd6680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-vpn"

RDEPENDS:${PN} += "bumblebee-status \
python3-tk"

inherit rpm
