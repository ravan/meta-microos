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

RPM_NAME = "python314-sortedcontainers-2.4.0-3.5.noarch.rpm"
RPM_HASH = "0ae79ef7922733a6729c13216a75af0dde778d6ec82302f14f4c1b24708cb047b794f7edf84b6c15d5db555e51f5f8206ad0901e9ea66c94cc1e22c3356b7a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sortedcontainers \
python314-sortedcontainers \
python3dist-sortedcontainers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
