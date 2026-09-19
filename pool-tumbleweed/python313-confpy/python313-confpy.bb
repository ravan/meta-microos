SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python313-confpy-0.11.0-3.5.noarch.rpm"
RPM_HASH = "9f264af8a13f68cce2f8b3f553165d32fa5a61cfb5096fc33abcdff8fda37d826148aa3222f491df24af5d9ae3799e16c7b5d37dd8499a2441b0ef25739793f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confpy \
python3.13dist-confpy \
python313-confpy \
python3dist-confpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
