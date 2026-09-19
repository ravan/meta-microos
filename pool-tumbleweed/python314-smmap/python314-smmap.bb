SUMMARY = "A pure python implementation of a sliding window memory map manager"
DESCRIPTION = "When reading from many possibly large files in a fashion similar to random \
access, it is usually the fastest and most efficient to use memory maps. \
Although memory maps have many advantages, they represent a very limited \
system resource as every map uses one file descriptor, whose amount is \
limited per process. On 32 bit systems, the amount of memory you can have \
mapped at a time is naturally limited to theoretical 4GB of memory, which \
may not be enough for some applications. \
 \
The documentation can be found here: http://packages.python.org/smmap"
LICENSE = "BSD-2-Clause"

PV = "5.0.3"

RPM_NAME = "python314-smmap-5.0.3-1.3.noarch.rpm"
RPM_HASH = "35c866236d6c3a627d55af8a1c2760519c87727bae2fd00c2bde21c06ddc8e81e3067288ea8a24f12e786f83c632d94b303048f13db9f8892850561a60364d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-smmap \
python314-smmap \
python3dist-smmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
