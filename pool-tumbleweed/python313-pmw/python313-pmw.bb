SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-pmw-2.1.1-3.5.noarch.rpm"
RPM_HASH = "1ece3412bd15181930770a7d6d1d994332dc175de20337aaddd55c544e16104f899b3321ae79316c68afd914af2bdb51db3e63cecd40fdd454c791c90424074a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pmw \
python3.13dist-pmw \
python313-pmw \
python3dist-pmw"

RDEPENDS:${PN} += "python-abi \
python313-tk"

inherit rpm
