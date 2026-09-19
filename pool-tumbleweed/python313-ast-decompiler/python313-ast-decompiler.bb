SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python313-ast-decompiler-0.8.0-2.4.noarch.rpm"
RPM_HASH = "56beb784985eca5030ff96bd7acde1296f7ba74ae582de68a772ddb0ba04bce384426d4a980e361947bf27d577844ca4ad43d3f9355c3740a7090fa9bafe98c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ast-decompiler \
python3.13dist-ast-decompiler \
python313-ast-decompiler \
python3dist-ast-decompiler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
