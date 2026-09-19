SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python313-contextvars-2.4-7.5.noarch.rpm"
RPM_HASH = "094c88756f099899f1235fe8e62dbad7aa3372f886a6c4b446cd80e18963420440964d1a737139434afc89dcc70d904eea9039f3a5058807f67f38b3b1df806f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-contextvars \
python3.13dist-contextvars \
python313-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python313-immutables"

inherit rpm
