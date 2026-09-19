SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.32.0"

RPM_NAME = "python314-python-binary-memcached-0.32.0-1.2.noarch.rpm"
RPM_HASH = "9f6d3e2542e30a0e91255a87689d2a9f287ea55f0ad53bdacc8672ffc8ee6ab2fd996b101ed81ad34ba3d5c6c7fea4e13e536858f0505e3165aaa3fb2e03f3fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-binary-memcached \
python314-python-binary-memcached \
python3dist-python-binary-memcached"

RDEPENDS:${PN} += "python-abi \
python314-six \
python314-uhashring"

inherit rpm
