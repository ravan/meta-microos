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

RPM_NAME = "python314-pyqt-builder-1.19.1-1.1.noarch.rpm"
RPM_HASH = "4e0c15b0f14c1aa017c4b1a0e80f7ffbf2f33395aed96c5465c4643c433a29e12ebb14585d9cbdb7dd2d0f041f5cdff42e2548b6540e46a16b289592f46bd6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyqt-builder \
python314-PyQt-builder \
python314-pyqt-builder \
python3dist-pyqt-builder"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging \
python314-sip-devel"

inherit rpm
