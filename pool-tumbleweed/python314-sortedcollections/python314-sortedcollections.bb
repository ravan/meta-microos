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

RPM_NAME = "python314-sortedcollections-2.1.0-3.5.noarch.rpm"
RPM_HASH = "1df648a2f0db7b683c54e970f7c06a6cdd869c15f8dddfede35be22e4f330da43b90aa91d94ee7d0117cfa1fc32af75461f2e92084bdab7ce8ded3538d43f250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sortedcollections \
python314-sortedcollections \
python3dist-sortedcollections"

RDEPENDS:${PN} += "python-abi \
python314-sortedcontainers"

inherit rpm
