SUMMARY = "Python client for Valkey forked from redis-py"
DESCRIPTION = "Python client for Valkey forked from redis-py"
LICENSE = "MIT"

PV = "6.1.1"

RPM_NAME = "python314-valkey-6.1.1-4.1.noarch.rpm"
RPM_HASH = "a514202e545e84bbb10101c6288c8e137ffff2fa59baa126fdbc649c3dd2c2e84a0a32b5079c45006988cfd8d8e0edc79051a17dc535779760950d8817880953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-valkey \
python314-valkey \
python3dist-valkey"

RDEPENDS:${PN} += "python-abi"

inherit rpm
