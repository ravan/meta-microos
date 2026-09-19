SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python313-safe-netrc-1.0.1-1.11.noarch.rpm"
RPM_HASH = "557135ad60d440b7116c4a927a2e5b58c2f4f546a81c1771a2b7109dba6bff98f19c06c7a52e40d008406b8bcd17b4ee663fafc04d1733ec7e11c7b07fcd9d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-safe-netrc \
python3.13dist-safe-netrc \
python313-safe-netrc \
python3dist-safe-netrc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
