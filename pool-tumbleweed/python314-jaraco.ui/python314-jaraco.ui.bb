SUMMARY = "User-Interface tools (mainly command-line)"
DESCRIPTION = "User-Interface tools (mainly command-line)"
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python314-jaraco.ui-2.4.0-2.5.noarch.rpm"
RPM_HASH = "4cdc8601cd95afd8c9a7dca393cf3387e400f17de20b5f6d5775046ad884fb1267e67b83f9b8af3e114e919e48255edf17aa34e91f83954a4d3092c0b4b61ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.ui \
python314-jaraco.ui \
python3dist-jaraco.ui"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.classes \
python314-jaraco.text \
python314-named \
python314-typer"

inherit rpm
