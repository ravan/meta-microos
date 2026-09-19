SUMMARY = "Simple wrapper for tabula-java, read tables from PDF into DataFrame"
DESCRIPTION = "tabula-py is a simple Python wrapper of tabula-java, which can read tables in a PDF. You can read tables \
from a PDF and convert them into a pandas DataFrame. tabula-py also enables you to convert a PDF file into \
a CSV, a TSV or a JSON file."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python313-tabula-py-2.10.0-1.8.noarch.rpm"
RPM_HASH = "cf38fe47834a590f6e24d4fefc59c066cc755c8ce348ea90372f066e13800481231e22040e12eb043ea120303d46371e9cab3140d30d94c5f6d03f291ee347b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabula-py \
python3.13dist-tabula-py \
python313-tabula-py \
python3dist-tabula-py"

RDEPENDS:${PN} += "python-abi \
python313-distro \
python313-numpy \
python313-pandas"

inherit rpm
