SUMMARY = "Examples for python313-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python313-qt5-doc-5.15.10-4.8.noarch.rpm"
RPM_HASH = "83452d10db3744b38fa417cb78f3a9b1808116b5911534c296cafeb4d9d456f507668d795a6f1842fceaf6fa75b43096ef1d0505b78a2353581a70271846a7f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt5-doc \
python3-qt5-doc \
python313-PyQt5-doc \
python313-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
