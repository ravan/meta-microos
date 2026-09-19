SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python314-redbaron-0.9.2-5.4.noarch.rpm"
RPM_HASH = "3de0df9f84443286a7ba088dc29b2ed433ce1ea98d9abfff31055f0a21800ea3ecb50f192f83aba2cdc715932346ed3d4449ff843acd1db85b68396b96f55a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-redbaron \
python314-redbaron \
python3dist-redbaron"

RDEPENDS:${PN} += "python-abi \
python314-baron"

inherit rpm
