SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python313-humanhash3-0.0.6-3.10.noarch.rpm"
RPM_HASH = "4a4a32734fb2623a5df309fb5cc4d18fa00ef0ce66f480218d7c2bb85446031d477cec4b6a6cc03e4319be11d70c6121e46788d08a8299e1fd76c5a2f971f5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanhash3 \
python3.13dist-humanhash3 \
python313-humanhash3 \
python3dist-humanhash3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
