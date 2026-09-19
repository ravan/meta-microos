SUMMARY = "Intelligent predictive wxPython text editor"
DESCRIPTION = "This package contains the wxPython predictive text editor pyprompter. \
 \
pyprompter is a cross-platform predictive text editor. \
 \
pyprompter displays predictions in a contextual pop-up box as each letter is typed. Predictions can be easily selected and inserted in the document."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-pyprompter-0.9.1-18.6.noarch.rpm"
RPM_HASH = "d77f8004f9e5e92ca7fb9d4040d15c33ac7be33269cf296a7ebd0530c930781265fb67135ed2d1dbbc1791468d52a3947264af2fd4c086e004dee231cf7c1228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyprompter \
python3-pyprompter \
python3.13dist-pyprompter \
python3dist-pyprompter"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-presage \
python3-wxPython"

inherit rpm
