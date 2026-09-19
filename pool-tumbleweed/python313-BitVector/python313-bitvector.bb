SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python313-BitVector-3.5.0-3.5.noarch.rpm"
RPM_HASH = "49ba2e1081fcbbc09e0a2ca3e32e040f2fbf4127bedc05f19509ccb6d8e7e73f6058edef84b0fdcda4bd06559135b464ea60bcd054bd6e14952bc765078d7bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-BitVector \
python3.13dist-bitvector \
python313-BitVector \
python3dist-bitvector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
