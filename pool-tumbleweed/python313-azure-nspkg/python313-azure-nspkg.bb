SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python313-azure-nspkg-3.0.2-5.9.noarch.rpm"
RPM_HASH = "2abb4d6cd402678e2639b419f9ca83a563ff4f525e5172a301349de143bcd1d55cb059b0ed5341a48f006bf6244631a5249342d8158179f813c4abdcbd9c2af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-nspkg \
python3.13dist-azure-nspkg \
python313-azure-nspkg \
python3dist-azure-nspkg"

RDEPENDS:${PN} += ""

inherit rpm
