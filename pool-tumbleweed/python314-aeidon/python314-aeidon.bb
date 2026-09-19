SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.15"

RPM_NAME = "python314-aeidon-1.15-1.9.noarch.rpm"
RPM_HASH = "5e639447228af23d016282f183f8770a394a39f896da6a103f2ec5e6dcb0aa6640bbb249fc8a13eac18e15e2bd2d9f878d697c0eb091cbdb30f778132a4060ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aeidon"

RDEPENDS:${PN} += "python-abi \
typelib-Gspell"

inherit rpm
