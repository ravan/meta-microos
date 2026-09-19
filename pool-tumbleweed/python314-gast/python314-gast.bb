SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python314-gast-0.7.0-1.1.noarch.rpm"
RPM_HASH = "ba1532f488d4785801938cb80ddb7db7c007b8e2d5c28bcba9a1094ed3c4989fd4e140d809c11368e9db4545a88710beabd2eab8ce0dee657fec22c05a3fa398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gast \
python314-gast \
python3dist-gast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
