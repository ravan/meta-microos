SUMMARY = "Shard tests to support parallelism across multiple machines"
DESCRIPTION = "Shards tests based on a hash of their test name enabling easy parallelism across machines, suitable for a wide variety \
of continuous integration services. Tests are split at the finest level of granularity, individual test cases, enabling \
parallelism even if all of your tests are in a single file (or even single parameterized test method)."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-pytest-shard-0.1.2-1.5.noarch.rpm"
RPM_HASH = "5e0ab20050e9318dd3259013ce5d4acba2b524ec20f486b9c71b0e7b95d680d3425a6d1a77f100b806f21aac146169b92f93258b3390b9e72ba2ab868c2c17c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-shard \
python3.13dist-pytest-shard \
python313-pytest-shard \
python3dist-pytest-shard"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
