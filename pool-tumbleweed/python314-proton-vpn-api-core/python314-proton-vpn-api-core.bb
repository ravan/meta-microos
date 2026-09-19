SUMMARY = "Proton VPN API library"
DESCRIPTION = "This package contains a facade to the other Proton VPN components, exposing a uniform API for Proton VPN client."
LICENSE = "GPL-3.0-or-later"

PV = "4.16.0"

RPM_NAME = "python314-proton-vpn-api-core-4.16.0-2.2.noarch.rpm"
RPM_HASH = "02bbe871ddbdf6de4a1c7688fda8f817d96f995ca6a200ae234b2f7cfed097e47c7f21581e712935af0a4447b263fffab8057e8370786aadaea06d7e4959465a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proton-vpn-api-core \
python314-proton-vpn-api-core \
python3dist-proton-vpn-api-core"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-PyNaCl \
python314-cryptography \
python314-distro \
python314-gobject \
python314-packaging \
python314-proton-core \
python314-proton-vpn-local-agent \
python314-pycairo \
python314-sentry-sdk"

inherit rpm
