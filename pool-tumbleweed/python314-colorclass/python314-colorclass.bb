SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python314-colorclass-2.2.2-3.9.noarch.rpm"
RPM_HASH = "072953efd125774ddf496d21d9a4d9f03a0c3bdb7016e12555ec9a378e8dc91f7e0984f5257c0ffd8e4617b6ab9ad32d5b2433d0b2c9f6b0ba6b0979b74d7f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colorclass \
python314-colorclass \
python3dist-colorclass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
