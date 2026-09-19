SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.32.0"

RPM_NAME = "python313-python-binary-memcached-0.32.0-1.2.noarch.rpm"
RPM_HASH = "b2d66a46b511ba17f358ef9cb3b856eea0a8202b8061fa61e4bd60d9d875bec6e139765e597c0d217123ce5a9e6d743f50806b5f25984a8f244874d70e80625c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-binary-memcached \
python3.13dist-python-binary-memcached \
python313-python-binary-memcached \
python3dist-python-binary-memcached"

RDEPENDS:${PN} += "python-abi \
python313-six \
python313-uhashring"

inherit rpm
