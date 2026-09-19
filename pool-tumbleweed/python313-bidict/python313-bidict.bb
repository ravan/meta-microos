SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.23.1"

RPM_NAME = "python313-bidict-0.23.1-1.10.noarch.rpm"
RPM_HASH = "7891ae1900632d689b3b8ff7e90d8260bc8c6a3b54d4644ee19fe7bc533e4115843706d8b5ab8e1351cd4fe306c3d89c453aef74bfce5e66337e05740a51b310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bidict \
python3.13dist-bidict \
python313-bidict \
python3dist-bidict"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
