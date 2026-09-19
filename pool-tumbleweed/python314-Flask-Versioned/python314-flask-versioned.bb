SUMMARY = "Add version info to file paths"
DESCRIPTION = "Add version info to file paths."
LICENSE = "BSD-3-Clause"

PV = "0.9.4"

RPM_NAME = "python314-Flask-Versioned-0.9.4-5.1.noarch.rpm"
RPM_HASH = "6f92c2d2920d678f58aa5099b900f2182f2aaf6eb6871c9944205f4d799748118cf355d6eb4e578c35676f27546f0a1505c6eca44c7ea36bcaf01df5145fd88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-versioned \
python314-Flask-Versioned \
python3dist-flask-versioned"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-setuptools"

inherit rpm
