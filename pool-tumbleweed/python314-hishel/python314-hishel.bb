SUMMARY = "Persistent cache implementation for popular HTTP clients"
DESCRIPTION = "Hishel (հիշել, to remember in Armenian) is a modern HTTP caching \
library for Python that implements RFC 9111 specifications. It \
provides seamless caching integration for popular HTTP clients with \
minimal code changes."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python314-hishel-1.3.1-1.1.noarch.rpm"
RPM_HASH = "cf27661d6df3291513eebcfd5ae1f2e4e4e7f4823093c271597479c57ae72627fe1e026a22e3043b778d582cdb36d044137fa2b995dfe508dc586ccdf58e67ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hishel \
python314-hishel \
python3dist-hishel"

RDEPENDS:${PN} += "python-abi \
python314-msgpack \
python314-typing-extensions"

inherit rpm
