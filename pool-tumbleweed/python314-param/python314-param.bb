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

RPM_NAME = "python314-param-2.4.1-2.1.noarch.rpm"
RPM_HASH = "b029cbd8941b3afafcafa869c74d71c2e487f52cce61a9d43a126be151d9c8a4cdfb68034d06e5c654c742ed9fbd818bc2494b76685bd16a2799c977e1d7d153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-param \
python314-param \
python3dist-param"

RDEPENDS:${PN} += "python-abi"

inherit rpm
