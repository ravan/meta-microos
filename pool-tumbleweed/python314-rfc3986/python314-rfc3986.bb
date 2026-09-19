SUMMARY = "Python module for validating URI references per RFC 3986"
DESCRIPTION = "A Python implementation of `RFC 3986`_ including validation and authority \
parsing. Coming soon: `Reference Resolution <http://tools.ietf.org/html/rfc3986#section-5>`_."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python314-rfc3986-2.0.0-3.5.noarch.rpm"
RPM_HASH = "764b3d31cb122b637d9b2f91eff99eaa7a310dd67fc99f849c2ada7f7d1088977c87408ca542c4dccccb1a0812d3ab5de4b7b99cc70adb52b36386d44c5e5059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rfc3986 \
python314-rfc3986 \
python3dist-rfc3986"

RDEPENDS:${PN} += "python-abi"

inherit rpm
