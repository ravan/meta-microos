SUMMARY = "A secure updater framework for Python"
DESCRIPTION = "The Update Framework (TUF) is a framework for secure content delivery \
and updates. It protects against various types of supply chain attacks \
and provides resilience to compromise."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python313-tuf-7.0.0-1.3.noarch.rpm"
RPM_HASH = "6708a31403de0308c17fb9045e2c338f984ff67ce258ec6603417441b13fa7be40e88031dd2336d86194c8284775d363f8ff3166c785b5e69de2938876c8b63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tuf \
python3.13dist-tuf \
python313-tuf \
python3dist-tuf"

RDEPENDS:${PN} += "python-abi \
python313-securesystemslib \
python313-urllib3"

inherit rpm
