SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python314-rfc3987-1.3.8-6.9.noarch.rpm"
RPM_HASH = "47dc1c47010fdfbce758c101ff3d4ef62cb53dcf1ea25dc2cef21c85fc2cf6694958378c097d8e33a95766c0e18e212d0baa6239cb14c6500a06a140ef55f6b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rfc3987 \
python314-rfc3987 \
python3dist-rfc3987"

RDEPENDS:${PN} += "python-abi"

inherit rpm
