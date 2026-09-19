SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-qt6pdf-devel-6.11.0-2.2.aarch64.rpm"
RPM_HASH = "92231b5944952a5b246b12b14ec3a22ddd69d816bb6707f2a55e608872cdaaa4eb255d288cff91c017c3f3624f9f0963f7844f14041d2d3abdcf399abb86d2a9"

RPROVIDES:${PN} += "python3-PyQt6-qt6pdf-devel \
python313-PyQt6-qt6pdf-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf \
cmake-Qt6PdfWidgets \
python-abi \
python313-PyQt6 \
python313-PyQt6-devel \
python313-dbus-python-devel \
python313-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
