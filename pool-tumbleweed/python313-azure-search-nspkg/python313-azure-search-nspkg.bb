SUMMARY = "Microsoft Azure Search Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Search namespace package. It isn't intended to be \
installed directly. Search client libraries are located elsewhere: \
 \
* azure-search-documents \
 \
This package is for Python 2 only. It provides the necessary files for other packages \
to extend the azure namespace. Python 3.x libraries use PEP420 instead."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-search-nspkg-1.0.0-5.9.noarch.rpm"
RPM_HASH = "bb4feadee2ff315993d77457e8ba9c1468ce87a0198d724638924ea506b0ded2e9b1c333e0c91717b7dc92931fa57cc480caa1db128c5d75e3d530cf33802cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-search-nspkg \
python3.13dist-azure-search-nspkg \
python313-azure-search-nspkg \
python3dist-azure-search-nspkg"

RDEPENDS:${PN} += "python313-azure-nspkg"

inherit rpm
