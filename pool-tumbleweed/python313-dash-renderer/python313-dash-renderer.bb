SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python313-dash-renderer-1.9.1-2.5.noarch.rpm"
RPM_HASH = "65dfcc0c70b0158ca6c0d27af71f316e81d3699270b4e92f5d3b4ebde49b04d9b1b70e965b78d5628dcb080d782fca4305290032f35878f4f2d15340e5159ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-renderer \
python3.13dist-dash-renderer \
python313-dash-renderer \
python3dist-dash-renderer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
