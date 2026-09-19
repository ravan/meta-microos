SUMMARY = "Header-only hashmap and btree containers for C++"
DESCRIPTION = "The hashmaps and btree provided here are built upon those open \
sourced by Google in the Abseil library. The hashmaps use closed \
hashing, where values are stored directly into a memory array, \
avoiding memory indirections. By using parallel SSE2 instructions, \
these hashmaps are able to look up items by checking 16 slots in \
parallel, allowing the implementation to remain fast even when the \
table is filled up to 87.5% capacity."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "parallel-hashmap-devel-2.0.0-1.4.noarch.rpm"
RPM_HASH = "7a00bc888744a64d7741eb563b8c61028ba0f7dffdd5af6d8fa3caa841d74ededcc7ebe70186053127a3b7ebda0a3d4a0f6f20408f8a3f65f3a60b0f2170f6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parallel-hashmap-devel"

RDEPENDS:${PN} += ""

inherit rpm
