SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python313-python-qprogedit-4.1.2-3.5.noarch.rpm"
RPM_HASH = "db7424ed302a6bf17bf33cd537da4e02f3a24e370d05549bab33752569c4294e4481635e9049bde3d48ae98f0220e3d0b1c505e695239d6676449f0510d18159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-qprogedit \
python3.13dist-python-qprogedit \
python313-python-qprogedit \
python3dist-python-qprogedit"

RDEPENDS:${PN} += "python-abi \
python313-QtPy \
python313-qscintilla-qt5"

inherit rpm
