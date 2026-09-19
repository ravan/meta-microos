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

RPM_NAME = "python314-munkres-1.1.4-4.14.noarch.rpm"
RPM_HASH = "49ac4864779069c62ecf75b687eff5d489ffab5752db587b68ad1186dbcf72e6831c441afded946125352bf4fe994fa40ec2077187e23a494dec04de702b6be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-munkres \
python314-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
