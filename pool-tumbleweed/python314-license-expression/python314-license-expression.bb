SUMMARY = "Library to parse, compare, simplify and normalize license expressions"
DESCRIPTION = "This module defines a mini language to parse, validate, simplify, normalize and \
compare license expressions using a boolean logic engine. \
 \
This supports SPDX license expressions and also accepts other license naming \
conventions and license identifiers aliases to resolve and normalize licenses. \
 \
Using boolean logic, license expressions can be tested for equality, \
containment, equivalence and can be normalized or simplified."
LICENSE = "Apache-2.0"

PV = "30.4.4"

RPM_NAME = "python314-license-expression-30.4.4-1.4.noarch.rpm"
RPM_HASH = "fd29a149ea06cdcfafeadbd5f9799ee8ff061e38055bacbb3e791dfc93b25355d3ba823822336e7ef1622c4fb6cf79fe735bf0266567cb61d451b5153645892a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-license-expression \
python314-license-expression \
python3dist-license-expression"

RDEPENDS:${PN} += "python-abi \
python314-boolean.py"

inherit rpm
