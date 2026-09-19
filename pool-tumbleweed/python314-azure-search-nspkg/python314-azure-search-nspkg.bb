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

RPM_NAME = "python314-azure-search-nspkg-1.0.0-5.9.noarch.rpm"
RPM_HASH = "a75aa077f046cc7f31d1818e7f18dfad6a3afb7261ce49d1c196495d282a76bd50ae26665fef49417c465dd7663c2da22bd6ccfacfacf613631b17a4c203c191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-search-nspkg \
python314-azure-search-nspkg \
python3dist-azure-search-nspkg"

RDEPENDS:${PN} += "python314-azure-nspkg"

inherit rpm
