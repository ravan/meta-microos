SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-aioitertools-0.13.0-1.4.noarch.rpm"
RPM_HASH = "91f4f74e9f8af82f47a46a80e72d47848b96d7e2774ac62c5c59ef672e67c8420f9722c1ab17d6891052a1e55524306746e94f46d522465f0a03c48f43b17cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aioitertools \
python314-aioitertools \
python3dist-aioitertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
