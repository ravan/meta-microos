SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-python-mimeparse-2.0.0-1.9.noarch.rpm"
RPM_HASH = "e86e7435dbe97b0f342e335b93b89de6072a70a96a21a0419068638c86c39d1406ba433d116f7be1c0a283dae7d2bad62f465a6a3c0233fa5184de2e34d25d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-mimeparse \
python314-python-mimeparse \
python3dist-python-mimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
