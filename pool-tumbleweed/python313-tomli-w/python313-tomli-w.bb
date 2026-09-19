SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-tomli-w-1.2.0-1.7.noarch.rpm"
RPM_HASH = "f9f7de6383b401ec530f5ea8159711ef5c5c107e6fcb5400f86e999e805acafde4922162dad06f612f12667608c70157a188282a6b94afd3912b1f1f19fa8cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomli-w \
python3.13dist-tomli-w \
python313-tomli-w \
python3dist-tomli-w"

RDEPENDS:${PN} += "python-abi"

inherit rpm
