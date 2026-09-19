SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.15.0"

RPM_NAME = "python313-asciimatics-1.15.0-2.10.noarch.rpm"
RPM_HASH = "0429467596e6846a211423a47e9ea878394f87850229eb701cc6577adf06c5a8e85d3efb5072faf39ecd06a3d66e6cb8e98eea8ce91ce1f04621c4a851855a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asciimatics \
python3.13dist-asciimatics \
python313-asciimatics \
python3dist-asciimatics"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-curses \
python313-pyfiglet \
python313-wcwidth"

inherit rpm
