SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.3.2"

RPM_NAME = "python313-pyparsing-3.3.2-1.3.noarch.rpm"
RPM_HASH = "7ac411ce2e7784c73c7005f80f03423f8fafe88f6e5f28401b45049541c4a7886699118188791f5a3766c01f1292004548afbfbd8bfad41ea3e113714646ccc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyparsing \
python3.13dist-pyparsing \
python313-pyparsing \
python3dist-pyparsing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
