SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python314-python-qprogedit-4.1.2-3.5.noarch.rpm"
RPM_HASH = "1223158b36783705c6f52fe451a9be479b66bf353416d694679893f510b2c31636343ef17cf49e2204d55d475fd4c6e52efd4d7dcf21ca3016ca53e3ce06d38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-qprogedit \
python314-python-qprogedit \
python3dist-python-qprogedit"

RDEPENDS:${PN} += "python-abi \
python314-QtPy \
python314-qscintilla-qt5"

inherit rpm
