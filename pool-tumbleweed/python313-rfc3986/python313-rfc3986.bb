SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python313-rfc3986-2.0.0-3.5.noarch.rpm"
RPM_HASH = "21bbdf763101cc509e4533a8c961eb79eec687f45cc9e14da0f78a5710089f224cb56025977a8d82c929ed3e566fb2113a918fdc548623fa202db867a24ddde7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3986 \
python3.13dist-rfc3986 \
python313-rfc3986 \
python3dist-rfc3986"

RDEPENDS:${PN} += "python-abi"

inherit rpm
