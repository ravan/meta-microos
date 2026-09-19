SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.23.1"

RPM_NAME = "python314-bidict-0.23.1-1.10.noarch.rpm"
RPM_HASH = "fe92f1c2ad10aa91ac790c1ede1e941d04a56ae1140e5b6227be5aeabd072cb168525fc957e2154d6997793d016e2e305af706289d634cb490bb0a36e1858c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bidict \
python314-bidict \
python3dist-bidict"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
