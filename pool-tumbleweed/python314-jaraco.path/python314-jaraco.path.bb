SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python314-jaraco.path-3.7.2-1.5.noarch.rpm"
RPM_HASH = "c6ad765c3af9e5106c7f5bcb2de7425a9bd366f3e0be48701a3291baad9a27781e1fac232ca93e00ac0f1f41d96ffe0dacce3fcd10d3d77ca6180c76ef4d1c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.path \
python314-jaraco.path \
python3dist-jaraco.path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
