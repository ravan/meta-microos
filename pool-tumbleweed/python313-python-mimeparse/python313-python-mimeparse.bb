SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-python-mimeparse-2.0.0-1.9.noarch.rpm"
RPM_HASH = "e80f0cecf220dc3b41d8970b9f98e08e6f3cbcb5337e255270ce10c93b562a3799b574576126518e537fe4b375ec6daf2e4655ed1a11c6d546f27f9fa5bf2188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mimeparse \
python3.13dist-python-mimeparse \
python313-python-mimeparse \
python3dist-python-mimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
