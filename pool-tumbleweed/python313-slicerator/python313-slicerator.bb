SUMMARY = "A lazy-loading, fancy-sliceable iterable"
DESCRIPTION = "A lazy-loading, fancy-sliceable iterable."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python313-slicerator-1.1.0-1.4.noarch.rpm"
RPM_HASH = "aef1c25b096d6e09b4b82e0db404f14b1e6c938c99582994cfe2aea279f0282c2864d8e97b0a2140e2ceffc886d1cd8eeeb8dcb8d5daa0b368f9082ffbb2ad63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slicerator \
python3.13dist-slicerator \
python313-slicerator \
python3dist-slicerator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
