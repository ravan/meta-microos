SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python314-baron-0.10.1-2.5.noarch.rpm"
RPM_HASH = "40eda615545fb16e449dca86e6f1ba1e0fafbbf4f04f1e093e4bd0a8d7a9ce7c43a651c1fa26af39d2f329a28ab53330acd0e5e88e7c33a003441b056a921eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-baron \
python314-baron \
python3dist-baron"

RDEPENDS:${PN} += "python-abi \
python314-rply"

inherit rpm
