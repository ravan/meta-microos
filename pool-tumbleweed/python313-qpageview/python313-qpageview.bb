SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt6/PyQt6"
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python313-qpageview-1.0.3-1.3.noarch.rpm"
RPM_HASH = "0f838d2d7dcda0a60c62f7128973b26318547ffee76758566a4abe7af2271d62fecc4c7c942ab2b7bd839c65fa3886a8ef3fbc72532a633cd6ba77a137e3985a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qpageview \
python3.13dist-qpageview \
python313-qpageview \
python3dist-qpageview"

RDEPENDS:${PN} += "python-abi \
python313-qt6"

inherit rpm
