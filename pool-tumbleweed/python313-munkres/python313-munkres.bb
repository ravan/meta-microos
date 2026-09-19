SUMMARY = "Munkres implementation for Python"
DESCRIPTION = "The Munkres module provides an O(n^3) implementation of the Munkres \
algorithm (also called the Hungarian algorithm or the Kuhn-Munkres \
algorithm). The algorithm models an assignment problem as an NxM cost \
matrix, where each element represents the cost of assigning the i'th \
worker to the j'th job, and it figures out the least-cost solution, \
choosing a single item from each row and column in the matrix, such \
that no row and no column are used more than once. \
 \
This particular implementation is based on \
http://csclab.murraystate.edu/~bob.pilgrim/445/munkres.html."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "python313-munkres-1.1.4-4.14.noarch.rpm"
RPM_HASH = "92228582d53c657ca94ff8f0fd192f4b7d9412947cc2711510da6ff41fd19ba43ad0d4d1a975b69c1800316274a8b470063475dc87f90df9d798cd07a302afbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-munkres \
python3.13dist-munkres \
python313-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
