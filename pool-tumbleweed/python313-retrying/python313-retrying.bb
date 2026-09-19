SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python313-retrying-1.4.2-1.3.noarch.rpm"
RPM_HASH = "e89f097cca51a590947fbb5c54378dc61d3bdc1258cc2a40109aadb550c8eb787771d65b7c60142f068460dc916adfec328b5f1730060ed49f5513096880ad0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retrying \
python3.13dist-retrying \
python313-retrying \
python3dist-retrying"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
