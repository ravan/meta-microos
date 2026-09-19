SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python314-contextvars-2.4-7.5.noarch.rpm"
RPM_HASH = "77d74d2dafde8c8e710422f8bcda9b89de869635d60808efb74d8c476bbf2bbf5e32167c55caf736742f3ec500f0837e3b448d6e4ba0be8e8c21a8eea429665e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-contextvars \
python314-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python314-immutables"

inherit rpm
