SUMMARY = "Missing widgets and components for PyQt/PySide"
DESCRIPTION = "superqt provides a variety of widgets that are not included in the native \
QtWidgets module, including multihandle (range) sliders, comboboxes, and more."
LICENSE = "BSD-3-Clause"

PV = "0.7.6"

RPM_NAME = "python314-superqt-0.7.6-1.4.noarch.rpm"
RPM_HASH = "b175aa444a664b692faca067250ab8053275f98b6212f97cd40ce09b61c8c6334acc4b08d1c0df41253d6daa25131dffef164bcbad65d960af904c3dbd46e3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-superqt \
python314-superqt \
python3dist-superqt"

RDEPENDS:${PN} += "python-abi \
python314-QtPy \
python314-pygments \
python314-typing-extensions"

inherit rpm
