SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python314-preggy-1.4.4-4.5.noarch.rpm"
RPM_HASH = "8628a32cd5e2f608b1f8e49115d8664d14cfefae74a6f875bdb57160343fccf58e2fce8b111b78a234bd825c04c59584f0d0f2e4244f627c68028fb6867e79ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-preggy \
python314-preggy \
python3dist-preggy"

RDEPENDS:${PN} += "python-abi \
python314-Unidecode \
python314-six"

inherit rpm
