SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.25.0"

RPM_NAME = "python314-aiorpcX-0.25.0-2.4.noarch.rpm"
RPM_HASH = "7ff4f2e3b10fcea291196b001d5e4013a20aa534f13b74e55bdd917a97cdcc7f7db74a24d7c8be6dba354988e6e9a254240839349c042d4666f2138aceec4db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiorpcx \
python314-aiorpcX \
python3dist-aiorpcx"

RDEPENDS:${PN} += "python-abi \
python314-attrs"

inherit rpm
