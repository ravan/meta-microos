SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.3.3"

RPM_NAME = "python314-behave-1.3.3-2.4.noarch.rpm"
RPM_HASH = "6d31aea001e28e12133da02300ef4ce416a78046ee68e361dc9cd0e4e7fe38cf83af608e1724c14f90e276da367be3e83d751bc2d5220142becc1ee703d446ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-behave \
python314-behave \
python3dist-behave"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-colorama \
python314-cucumber-expressions \
python314-cucumber-tag-expressions \
python314-parse \
python314-parse-type \
python314-six"

inherit rpm
