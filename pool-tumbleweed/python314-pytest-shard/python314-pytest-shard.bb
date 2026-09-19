SUMMARY = "Shard tests to support parallelism across multiple machines"
DESCRIPTION = "Shards tests based on a hash of their test name enabling easy parallelism across machines, suitable for a wide variety \
of continuous integration services. Tests are split at the finest level of granularity, individual test cases, enabling \
parallelism even if all of your tests are in a single file (or even single parameterized test method)."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-pytest-shard-0.1.2-1.5.noarch.rpm"
RPM_HASH = "6800cb7daa9fbd018e58c0600b49ff3dd4026502ac8628e1d06171fd05d2626dd5a0d6391b29f80b92f7f1e66b6c8108dfc4dbf4480ddebe92a0d955463376ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-shard \
python314-pytest-shard \
python3dist-pytest-shard"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
