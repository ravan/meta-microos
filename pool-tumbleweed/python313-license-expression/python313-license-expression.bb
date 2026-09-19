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

RPM_NAME = "python313-license-expression-30.4.4-1.4.noarch.rpm"
RPM_HASH = "48804c223109d9dbad48843b605c2cb5a894d83c3a9115dae5f0371f717a8e1f57a59ce18ffed1a16992aef7d8b857d0fd8a256214547ae8f5660a59d5a135b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-license-expression \
python3.13dist-license-expression \
python313-license-expression \
python3dist-license-expression"

RDEPENDS:${PN} += "python-abi \
python313-boolean.py"

inherit rpm
