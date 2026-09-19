SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python314-ast-decompiler-0.8.0-2.4.noarch.rpm"
RPM_HASH = "56bd0b6c372ea4d85869b2cd7ec80918e2717ee5167a167f4a3f8e23c1357a1b268850e07def14a8f42c588fed9b039ea80cd47cc988f1a86d22ac0546c9227e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ast-decompiler \
python314-ast-decompiler \
python3dist-ast-decompiler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
