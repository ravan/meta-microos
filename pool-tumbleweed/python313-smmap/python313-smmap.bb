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

RPM_NAME = "python313-smmap-5.0.3-1.3.noarch.rpm"
RPM_HASH = "fd1da69ae4d1a10e5329b3db0ee3bb4feb0495cc9088775c38eda2dc653078ebce72753a81532ddbcc649c48ca335d9c35a329ca50ea46d474832c7a85a0f6fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smmap \
python3.13dist-smmap \
python313-smmap \
python3dist-smmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
