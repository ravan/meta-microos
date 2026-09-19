SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python314-build-1.5.0-1.2.noarch.rpm"
RPM_HASH = "c6f9a8e0d1dfbfe23f1d29bf84a51df10e6ed7d96593681ce24ceb5eaed1fb246a2d220552da5ddda8c8d1d1d8686a6e6a2e49bd7ead74a6de7da12e70ca3ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-build \
python314-build \
python3dist-build"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging \
python314-pyproject-hooks"

inherit rpm
