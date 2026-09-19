SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.37.0"

RPM_NAME = "python313-referencing-0.37.0-2.5.noarch.rpm"
RPM_HASH = "7d0481676aabb373d6c842c20c1058c9c750d9d23c0eef552bf099b5fbbd358a2ca7f1a361c20207911e9db7eaa7aa6f63b4ea0e2a2a4b7e63414f6ab2c86ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-referencing \
python3.13dist-referencing \
python313-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-rpds-py \
python313-typing-extensions"

inherit rpm
