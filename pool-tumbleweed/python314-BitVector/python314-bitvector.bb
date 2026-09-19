SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python314-BitVector-3.5.0-3.5.noarch.rpm"
RPM_HASH = "8d0ef029b7a9e7600ad849ac7d3c2e27b98037c15e8206e494f0f1865074fd74c1784a61de40709429f9e40ad522b0104d37da3be9d09371a8db96d0abdaab74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bitvector \
python314-BitVector \
python3dist-bitvector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
