SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python313-baron-0.10.1-2.5.noarch.rpm"
RPM_HASH = "d214a9a97a95b33e96dea239c6e577fd737c85a69605f890add1f425fa85c978020846a3a7e05292bdcc701bae2ab60cfeb707c956adf55bf3164b72dc775bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-baron \
python3.13dist-baron \
python313-baron \
python3dist-baron"

RDEPENDS:${PN} += "python-abi \
python313-rply"

inherit rpm
