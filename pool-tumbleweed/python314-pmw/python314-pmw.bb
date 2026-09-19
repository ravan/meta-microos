SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-pmw-2.1.1-3.5.noarch.rpm"
RPM_HASH = "e00d2be89ac86dd9f501dcb2f116b1aee3f1905179db02dbfc95e3bf4846dcf26c5d1d0bc09a635d4574267f563df72064219c286db70d467e6b1aa0d30b7c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pmw \
python314-pmw \
python3dist-pmw"

RDEPENDS:${PN} += "python-abi \
python314-tk"

inherit rpm
