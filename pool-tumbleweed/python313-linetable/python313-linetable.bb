SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python313-linetable-0.0.3-2.5.noarch.rpm"
RPM_HASH = "1e83e24c4387494243c2245235c7cf328bf022bb4040b1f5305d9e5726c3dd3bf1f5551891e99512c7bc2ca64ce302f920a36023b4c5e8e484e60d78489a475b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linetable \
python3.13dist-linetable \
python313-linetable \
python3dist-linetable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
