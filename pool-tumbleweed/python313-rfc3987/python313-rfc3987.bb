SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python313-rfc3987-1.3.8-6.9.noarch.rpm"
RPM_HASH = "56a6b5600b8ebb281be2e7e7d81b343946a7e965e8c7dffba1e00221abc1a570c65398c8680ea2a3d34729c458bfb2e0054e85ac2e391e81a808534e4953bf6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3987 \
python3.13dist-rfc3987 \
python313-rfc3987 \
python3dist-rfc3987"

RDEPENDS:${PN} += "python-abi"

inherit rpm
