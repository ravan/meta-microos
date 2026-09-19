SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python313-kazoo-2.11.0-1.3.noarch.rpm"
RPM_HASH = "bbcb7352455bccdc5b6297c2f67e4eeeda0a250a82a5395f4a809c9b1dc59e9ff2b10edaa7caa305f5c5e622d5cefbc45e45404eb98ea2ccfe1d9b91ae248511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kazoo \
python3.13dist-kazoo \
python313-kazoo \
python3dist-kazoo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
