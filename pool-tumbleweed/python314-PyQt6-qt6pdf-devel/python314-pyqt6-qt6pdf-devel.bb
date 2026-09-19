SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-qt6pdf-devel-6.11.0-2.2.aarch64.rpm"
RPM_HASH = "5bb3b5b767223c1e8eda36d5840f25de45258f058a190a0559cc7e5ccd01da57e8542bf547213a1af9bccdb6750dda409c950af4d39b69787d1acab1cee1ae1a"

RPROVIDES:${PN} += "python314-PyQt6-qt6pdf-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf \
cmake-Qt6PdfWidgets \
python-abi \
python314-PyQt6 \
python314-PyQt6-devel \
python314-dbus-python-devel \
python314-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
