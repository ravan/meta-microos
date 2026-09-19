SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python313-redbaron-0.9.2-5.4.noarch.rpm"
RPM_HASH = "bbd0d90e0e655a9594cd58883fb5b03d5f79169cfc3fdae36ca3f6510d3173485a074b2d3ca47d09f48a75dc951126d1a9edc8af8f42a0fa7535dd1c3d5e3c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redbaron \
python3.13dist-redbaron \
python313-redbaron \
python3dist-redbaron"

RDEPENDS:${PN} += "python-abi \
python313-baron"

inherit rpm
