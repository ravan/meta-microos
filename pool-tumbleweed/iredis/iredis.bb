SUMMARY = "Terminal client for Redis with auto-completion and syntax highlighting"
DESCRIPTION = "A terminal client for redis with auto-completion and syntax \
highlighting. IRedis lets one type Redis commands, and it displays results. \
 \
IRedis is an alternative for redis-cli. In most cases, IRedis behaves \
exactly the same as redis-cli. IRedis will prevent accidentally \
running dangerous commands."
LICENSE = "BSD-3-Clause"

PV = "1.15.2"

RPM_NAME = "iredis-1.15.2-1.4.noarch.rpm"
RPM_HASH = "4ea9a544cbaaaeaf0077ad520830e16f5118e02f23d4fcbc2b9ace9b24b4e89ad96e85fed84a4e7b428fa110f9a82249893bc626b3d71db142fe66972982eaeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iredis \
python3.13dist-iredis \
python3dist-iredis"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Pygments \
python3-click \
python3-configobj \
python3-mistune \
python3-packaging \
python3-prompt-toolkit \
python3-python-dateutil \
python3-redis \
python3-wcwidth"

inherit rpm
