SUMMARY = "Proton VPN API library"
DESCRIPTION = "This package contains a facade to the other Proton VPN components, exposing a uniform API for Proton VPN client."
LICENSE = "GPL-3.0-or-later"

PV = "4.16.0"

RPM_NAME = "python311-proton-vpn-api-core-4.16.0-1.1.noarch.rpm"
RPM_HASH = "fc2afa1a73f0eb199e2b695384a92f219326d76d6e36c8975d23d147e20680cae1e573bb18d3847cfd3266677d8b2ab562205e1bf2c3f1f9448f445a67ab7a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-proton-vpn-api-core \
python311-proton-vpn-api-core \
python3dist-proton-vpn-api-core"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-cryptography \
python311-distro \
python311-proton-core \
python311-sentry-sdk"

inherit rpm
