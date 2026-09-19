SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python313-pyscreenshot-3.1-3.5.noarch.rpm"
RPM_HASH = "f6bd562e87e21d691a5bd6ee05ddfb85caf3d9978efe9650360223e51d53fcb08b733c725788eb6c52a6151946a85a91212573bf732c1190a8a9e8172a4dc7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyscreenshot \
python3.13dist-pyscreenshot \
python313-pyscreenshot \
python3dist-pyscreenshot"

RDEPENDS:${PN} += "python-abi \
python313-EasyProcess \
python313-entrypoint2 \
python313-jeepney \
python313-mss \
xorg-x11-server-extra"

inherit rpm
