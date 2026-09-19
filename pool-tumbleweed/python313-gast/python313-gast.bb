SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python313-gast-0.7.0-1.1.noarch.rpm"
RPM_HASH = "fd4b9be3817a36ac976a0625d18c7951cb777ba17d2afeeafd85e7524cf104ca132ef22088a41cdc3a81ca33ce5c17d97da0c61b4b62000fdaa08112502ba44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gast \
python3.13dist-gast \
python313-gast \
python3dist-gast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
