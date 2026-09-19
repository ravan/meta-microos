SUMMARY = "Examples for python314-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python314-qt5-doc-5.15.10-4.8.noarch.rpm"
RPM_HASH = "ffd586397200dfd8bae526fc7c7eb0448a52f6e2b81b6bd8ea69818d7a9cbdff8d6d57c9a307fa24f2e58d64b575ff1a15e7982506dd4978942ecc3638d44695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-PyQt5-doc \
python314-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
