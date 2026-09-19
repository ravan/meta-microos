SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.14.3"

RPM_NAME = "python313-traitlets-5.14.3-3.5.noarch.rpm"
RPM_HASH = "128fa9610a56a831be849c1e6da6ca33d0a8a67e504cbfdbe296fb434b192a69e369b56e9abc429244aa09a4169b78c3fb28ddc0c35be7ec048822dff0d57029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traitlets \
python3.13dist-traitlets \
python313-traitlets \
python3dist-traitlets"

RDEPENDS:${PN} += "python-abi"

inherit rpm
