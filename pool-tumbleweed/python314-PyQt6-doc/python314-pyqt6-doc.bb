SUMMARY = "Examples for python314-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-doc-6.11.0-2.3.noarch.rpm"
RPM_HASH = "3f8a55ff90eb098591f9a7e93798a0271ad5397d4b132f4ae39633fda41a69a865c540b6cecdd423ac35bec235f4bb583538030a3ddbf90d2b0ab17365acbe1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-PyQt6-doc \
python314-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
