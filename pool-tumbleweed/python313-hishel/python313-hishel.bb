SUMMARY = "Persistent cache implementation for popular HTTP clients"
DESCRIPTION = "Hishel (հիշել, to remember in Armenian) is a modern HTTP caching \
library for Python that implements RFC 9111 specifications. It \
provides seamless caching integration for popular HTTP clients with \
minimal code changes."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python313-hishel-1.3.1-1.1.noarch.rpm"
RPM_HASH = "3b75f699ceea5883732f01ddd733277cafa63d276a5ec804581174cb8004db03b359b9f130fb81dcba7d492f255f4f95ae3bc285a9c384d83f70075b0d1d6d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hishel \
python3.13dist-hishel \
python313-hishel \
python3dist-hishel"

RDEPENDS:${PN} += "python-abi \
python313-msgpack \
python313-typing-extensions"

inherit rpm
