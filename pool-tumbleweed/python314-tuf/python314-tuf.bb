SUMMARY = "A secure updater framework for Python"
DESCRIPTION = "The Update Framework (TUF) is a framework for secure content delivery \
and updates. It protects against various types of supply chain attacks \
and provides resilience to compromise."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python314-tuf-7.0.0-1.3.noarch.rpm"
RPM_HASH = "792ff0db25e9284414a7ad2f8b9fd86a1b037a8ce677ac9a1e73db3df3adbf73c6124a22b148f6b3bc98429dcbc2d1347bb1e48c9bebe7d70200498461ad8cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tuf \
python314-tuf \
python3dist-tuf"

RDEPENDS:${PN} += "python-abi \
python314-securesystemslib \
python314-urllib3"

inherit rpm
