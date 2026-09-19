SUMMARY = "A heap with decrease-key and increase-key operations"
DESCRIPTION = "HeapDict implements the MutableMapping ABC, meaning it works pretty \
much like a regular Python dict.  It's designed to be used as a \
priority queue. \
 \
Unlike the Python standard library's heapq module, the HeapDict \
supports efficiently changing the priority of an existing object \
(often called 'decrease-key' in textbooks).  Altering the priority is \
important for many algorithms such as Dijkstra's Algorithm and A*."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python313-HeapDict-1.0.1-4.5.noarch.rpm"
RPM_HASH = "0667b91786d3c1b9fc31f82c4b051f61a9a144442d0a1faed6f22f8a70133a52af22583b59c7baf180df6ff741aba00ac2eeef57f9722af3bfa283c21a159a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-HeapDict \
python3.13dist-heapdict \
python313-HeapDict \
python3dist-heapdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
