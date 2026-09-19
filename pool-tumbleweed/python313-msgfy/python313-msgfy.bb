SUMMARY = "Converts python exception instance to human-readable error messages"
DESCRIPTION = "A Python library for convert Exception instance to a human-readable \
error message."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-msgfy-0.2.1-1.7.noarch.rpm"
RPM_HASH = "4c2900d33936b288ebc209898ce9e513abfe20d2362919cbf1831fc96abda92081d2769b13b3c5f6e09c5671110243d1c89e883da62c50a9b30ab7d6e174f9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msgfy \
python3.13dist-msgfy \
python313-msgfy \
python3dist-msgfy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
