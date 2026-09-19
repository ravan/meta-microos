SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python313-pyfiglet-1.0.4-1.3.noarch.rpm"
RPM_HASH = "70fd5392d5113e91f85d3eb00e493c55b150a6aa021311e45c7799079fd62ee0543344eb397ae730990325f9b24d05262ade84ab6956a8af7c3e078c93ac217e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfiglet \
python3.13dist-pyfiglet \
python313-pyfiglet \
python3dist-pyfiglet"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
