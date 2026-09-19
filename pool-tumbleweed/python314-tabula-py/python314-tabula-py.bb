SUMMARY = "Simple wrapper for tabula-java, read tables from PDF into DataFrame"
DESCRIPTION = "tabula-py is a simple Python wrapper of tabula-java, which can read tables in a PDF. You can read tables \
from a PDF and convert them into a pandas DataFrame. tabula-py also enables you to convert a PDF file into \
a CSV, a TSV or a JSON file."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python314-tabula-py-2.10.0-1.8.noarch.rpm"
RPM_HASH = "bf23b6d7ed50ac56e8c5620ef11b603b3108e692ddd4f2a2c1893e2efb77b4d809464fbfb1d67b5a8beb318b5161710a08691afc554e39f76b21c2ad267391ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tabula-py \
python314-tabula-py \
python3dist-tabula-py"

RDEPENDS:${PN} += "python-abi \
python314-distro \
python314-numpy \
python314-pandas"

inherit rpm
