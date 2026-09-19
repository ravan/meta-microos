SUMMARY = "Python Sorted Collections"
DESCRIPTION = "SortedCollections is an Python sorted collections library. \
 \
Features \
-------- \
 \
- ValueSortedDict - Dictionary with (key, value) item pairs sorted by value. \
- ItemSortedDict - Dictionary with key-function support for item pairs. \
- OrderedDict - Ordered dictionary with numeric indexing support. \
- OrderedSet - Ordered set with numeric indexing support. \
- IndexableDict - Dictionary with numeric indexing support. \
- IndexableSet - Set with numeric indexing support. \
- SegmentList - List with fast random access insertion and deletion."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-sortedcollections-2.1.0-3.5.noarch.rpm"
RPM_HASH = "ce53fc2f0f874db8d3e2ba1c57b067f29abc1fdcda825c7b7f0335418eb017b8e4398047b6f67f1e4fd552773dccdc59dea90f344906c556a959b35663cb062b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortedcollections \
python3.13dist-sortedcollections \
python313-sortedcollections \
python3dist-sortedcollections"

RDEPENDS:${PN} += "python-abi \
python313-sortedcontainers"

inherit rpm
