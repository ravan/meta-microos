SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python314-safe-netrc-1.0.1-1.11.noarch.rpm"
RPM_HASH = "c4492fb05d4506b5af6a3ff96117da6f6ba314126d4d177109da9c6d0fad30489ad62352e50615f56f57445f8433c54df4a010cc91bb162d334ebc5c7bfa86cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-safe-netrc \
python314-safe-netrc \
python3dist-safe-netrc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
