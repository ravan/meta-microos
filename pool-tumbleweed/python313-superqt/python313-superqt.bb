SUMMARY = "Missing widgets and components for PyQt/PySide"
DESCRIPTION = "superqt provides a variety of widgets that are not included in the native \
QtWidgets module, including multihandle (range) sliders, comboboxes, and more."
LICENSE = "BSD-3-Clause"

PV = "0.7.6"

RPM_NAME = "python313-superqt-0.7.6-1.4.noarch.rpm"
RPM_HASH = "95bc2561247f45da4401bed68227fa34c0910605182497bbbf6b4a91992147a62d62a87948fcd8d9d7a87148f52a2f0725658c7d76d43e961b39fe6a4c415c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-superqt \
python3.13dist-superqt \
python313-superqt \
python3dist-superqt"

RDEPENDS:${PN} += "python-abi \
python313-QtPy \
python313-pygments \
python313-typing-extensions"

inherit rpm
