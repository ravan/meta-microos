SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python313-ipyvue-1.12.0-1.3.noarch.rpm"
RPM_HASH = "216f162c1127c8096fdc3f1c13fc6b98bd3811ded8a9f1e892a18d38c0609daa06f34c4fab332cd1a4264264b4007b1cead4bef25b32817b4cd259610009ed50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvue \
python3.13dist-ipyvue \
python313-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python313-ipywidgets"

inherit rpm
