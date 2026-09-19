SUMMARY = "Sorted container data types"
DESCRIPTION = "SortedContainers is an Apache2 licensed containers library, written in \
pure-Python, and fast as C-extensions. \
 \
Python's standard library is great until you need a sorted container type. Many \
will attest that you can get really far without one, but the moment you **really \
need** a sorted list, dict, or set, you're faced with a dozen different \
implementations, most using C-extensions without great documentation and \
benchmarking. \
 \
SortedContainers takes all of the work out of Python sorted types - making your \
deployment and use of Python easy. There's no need to install a C compiler or \
pre-build and distribute custom extensions. Performance is a feature and testing \
has 100% coverage with unit tests and hours of stress."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python313-sortedcontainers-2.4.0-3.5.noarch.rpm"
RPM_HASH = "b0cada7ea82dc9e82758040583a6bd9b9b051e211882d34d7219b6c5279735cec51ae581ff81a49ead0273a182c5b279d85db729015b5e75d21293264ad838cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortedcontainers \
python3.13dist-sortedcontainers \
python313-sortedcontainers \
python3dist-sortedcontainers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
