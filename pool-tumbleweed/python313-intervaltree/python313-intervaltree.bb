SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python313-intervaltree-3.2.1-1.4.noarch.rpm"
RPM_HASH = "91f9c3b7eac841e7564a76e64b6ad7c7b4d806511366b86977bb01792ec8baec16cb352d8c5cd72fe267296160f37a40a4103ad1715e3ea472e5127b3a367e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intervaltree \
python3.13dist-intervaltree \
python313-intervaltree \
python3dist-intervaltree"

RDEPENDS:${PN} += "python-abi \
python313-sortedcontainers"

inherit rpm
