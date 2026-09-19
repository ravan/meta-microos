SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.15"

RPM_NAME = "python313-aeidon-1.15-1.9.noarch.rpm"
RPM_HASH = "9cd101ab33f14d2ba40e1a1947665eaf72a6d7b8b162c34d7cd529b7c553960c663ef8be9c7239b25beefe99876826b2c07a325ce57951b915e46a9003556eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aeidon \
python313-aeidon"

RDEPENDS:${PN} += "python-abi \
typelib-Gspell"

inherit rpm
