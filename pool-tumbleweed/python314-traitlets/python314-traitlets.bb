SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.14.3"

RPM_NAME = "python314-traitlets-5.14.3-3.5.noarch.rpm"
RPM_HASH = "d050ec53ec911008db5860e488acae5c762ec8f7744ee94e2bcb3e60d9cfa7c5a30c751ab79c5491db3a071cf682a8c77c44ebe56ee86582d7912baff1a8b017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-traitlets \
python314-traitlets \
python3dist-traitlets"

RDEPENDS:${PN} += "python-abi"

inherit rpm
