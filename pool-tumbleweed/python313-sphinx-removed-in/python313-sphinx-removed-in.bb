SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python313-sphinx-removed-in-0.2.3-1.9.noarch.rpm"
RPM_HASH = "f51a6a2390f663e2e30ae3fd4cb4109a0c9712751adff43d77bd9d8fe498c59415473b7b5f709d33da7cc2ebe97fa115367b0f92fb2b08ff4ced2ff6250fda83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-removed-in \
python3.13dist-sphinx-removed-in \
python313-sphinx-removed-in \
python3dist-sphinx-removed-in"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
