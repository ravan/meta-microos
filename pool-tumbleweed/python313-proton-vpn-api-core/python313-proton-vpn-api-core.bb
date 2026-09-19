SUMMARY = "Proton VPN API library"
DESCRIPTION = "This package contains a facade to the other Proton VPN components, exposing a uniform API for Proton VPN client."
LICENSE = "GPL-3.0-or-later"

PV = "4.16.0"

RPM_NAME = "python313-proton-vpn-api-core-4.16.0-2.2.noarch.rpm"
RPM_HASH = "a0498e1870588c283c3fd350b7af3d4d0d20bcd9a84117e68fba8698989d520fb5916893aadf93cfbf455aa1361258add679b8e60ceee9d68e833a0224945c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proton-vpn-api-core \
python3.13dist-proton-vpn-api-core \
python313-proton-vpn-api-core \
python3dist-proton-vpn-api-core"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-PyNaCl \
python313-cryptography \
python313-distro \
python313-gobject \
python313-packaging \
python313-proton-core \
python313-proton-vpn-local-agent \
python313-pycairo \
python313-sentry-sdk"

inherit rpm
