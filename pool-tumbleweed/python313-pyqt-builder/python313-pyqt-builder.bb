SUMMARY = "The PEP 517 compliant PyQt build system"
DESCRIPTION = "PyQt-builder is the PEP 517 compliant build system for PyQt and projects that \
extend PyQt. It extends the sip build system and uses Qt’s qmake to perform the \
actual compilation and installation of extension modules. \
 \
Projects that use PyQt-builder provide an appropriate pyproject.toml file and an \
optional project.py script. Any PEP 517 compliant frontend, for example \
sip-install or pip can then be used to build and install the project."
LICENSE = "BSD-2-Clause"

PV = "1.19.1"

RPM_NAME = "python313-pyqt-builder-1.19.1-1.1.noarch.rpm"
RPM_HASH = "220607f6bea5182e8fc5b859b84645ecc68033ad9e9935a20369c6bee393bde0865591b12cdbda46f7134b047a03f86897cbe67bedcd1366b003d14b3a19086c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt-builder \
python3-pyqt-builder \
python3.13dist-pyqt-builder \
python313-PyQt-builder \
python313-pyqt-builder \
python3dist-pyqt-builder"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging \
python313-sip-devel"

inherit rpm
