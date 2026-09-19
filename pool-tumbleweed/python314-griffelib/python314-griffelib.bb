SUMMARY = "Signatures for entire Python programs (library)"
DESCRIPTION = "This is the library for griffe package."
LICENSE = "ISC"

PV = "2.0.2"

RPM_NAME = "python314-griffelib-2.0.2-1.3.noarch.rpm"
RPM_HASH = "143c372b8cd0160c8392fbe43a062cf07d78f0e13697e49f37d0e5ef40f0ad0115d0b50feeef1ef06489e656b840184a24e08551e74ac4038bd99d06ca5d6d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-griffelib \
python314-griffelib \
python3dist-griffelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
