SUMMARY = "Access dict values as attributes (works recursively)"
DESCRIPTION = "EasyDict allows accessing dict values as attributes (works \
recursively). It provides Javascript-like properties dot notation \
for Python dicts."
LICENSE = "LGPL-3.0-only"

PV = "1.13"

RPM_NAME = "python314-easydict-1.13-1.1.noarch.rpm"
RPM_HASH = "2c82ed3acd677b4d70d41505f0f06b0ac39e7b6739ecec0e685b05bb6f74f0c6629be4e2dc518c3b05fa1bb05be781fbff542e0c3f41a6b7dfc10b4525bbad01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-easydict \
python314-easydict \
python3dist-easydict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
