SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python314-azure-common-1.1.28-3.9.noarch.rpm"
RPM_HASH = "901f74eb81192f6cb6fede81bb6567887eef3411a30038616d6f4640877c13e506078693d2301ae91f422ce38cde63c5415a639c3d80c2799b0e2a1ba4b5c834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-common \
python314-azure-common \
python3dist-azure-common"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
