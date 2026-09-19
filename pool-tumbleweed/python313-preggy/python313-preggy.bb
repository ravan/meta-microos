SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python313-preggy-1.4.4-4.5.noarch.rpm"
RPM_HASH = "73c41bfe37c114428b0f4107c32153db808f09fd59afbbc42904430caf1ea38128a800d3c8dea5766da04c339f46ecc7f274b34c1390eb73a85b66d90e59b6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-preggy \
python3.13dist-preggy \
python313-preggy \
python3dist-preggy"

RDEPENDS:${PN} += "python-abi \
python313-Unidecode \
python313-six"

inherit rpm
