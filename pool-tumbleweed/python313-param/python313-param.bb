SUMMARY = "Declarative Python programming using Parameters"
DESCRIPTION = "Param is a library providing Parameters: Python attributes extended to \
have features such as type and range checking, dynamically generated \
values, documentation strings, default values, etc., each of which is \
inherited from parent classes if not specified in a subclass. \
 \
Param contains only two required Python files, with no external \
dependencies, and is provided freely for both non-commercial and \
commercial use under a BSD license, so that it can easily be included \
as part of other projects."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python313-param-2.4.1-2.1.noarch.rpm"
RPM_HASH = "a59c970f574f189d8b498325e0545d3450d9422fe2ae14e6834c4efb31ec09b40aff329dff35b81a5c8459c746e5eaa4ffc6be865cc8d02f53dc1da418cc4c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-param \
python3.13dist-param \
python313-param \
python3dist-param"

RDEPENDS:${PN} += "python-abi"

inherit rpm
