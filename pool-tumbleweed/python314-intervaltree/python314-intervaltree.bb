SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python314-intervaltree-3.2.1-1.4.noarch.rpm"
RPM_HASH = "3fbd24cb25d26482f05836da8c16bef79410d0b0b2be6c67bb74823393c809dbb15f729ba861c809d14a5c0936ddb23f28697ec37b92bbfda346888b3c04bba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-intervaltree \
python314-intervaltree \
python3dist-intervaltree"

RDEPENDS:${PN} += "python-abi \
python314-sortedcontainers"

inherit rpm
