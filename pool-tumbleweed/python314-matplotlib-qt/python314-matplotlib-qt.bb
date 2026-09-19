SUMMARY = "Qt backend for python314-matplotlib"
DESCRIPTION = "This package includes the Qt-based backend \
for the python314-matplotlib plotting package \
PyQt6 or Pyside 6 may be used. \
PyQt5 and Pyside2 still work, but are not supported by openSUSE anymore."
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-qt-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "bbf54d53bd910109b6cb1ba930948032a25ab597ca76ceb72f3d1c14724b62acc93c442d63b4ff5c4117c863d9c6bb1477eea08870690f33e132ca04c3f1b3f1"

RPROVIDES:${PN} += "python314-matplotlib-qt \
python314-matplotlib-qt-shared \
python314-matplotlib-qt5 \
python314-matplotlib-qt6"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib"

inherit rpm
