SUMMARY = "The python pandas[all] extra"
DESCRIPTION = "This package provides most the [all] extra for python-pandas \
 \
Some requirements defined in the PyPI package are left out \
because they are not available as openSUSE RPM packages: \
 \
  * pandas-gbq \
  * pyxlsb \
  * s3fs \
  * dataframe-api-compat \
  * adbc-driver-postgresql \
  * adbc-driver-sqlite \
  * calamine \
 \
You can install them directly through `pip3.13 install --user`, if needed."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-all-3.0.5-2.2.noarch.rpm"
RPM_HASH = "0fa8e94691d168f92e88454e98620fe934aeb735ffc1a8e672df28fc590bc6c140e6eab7ef8781ae60b331291f3e0239bcdbd2da36e8f4838e1d66c6d39e4e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-all \
python313-pandas-all"

RDEPENDS:${PN} += "python313-Bottleneck \
python313-Jinja2 \
python313-PyMySQL \
python313-PyQt5 \
python313-QtPy \
python313-SQLAlchemy \
python313-XlsxWriter \
python313-beautifulsoup4 \
python313-blosc \
python313-fsspec \
python313-gcsfs \
python313-html5lib \
python313-hypothesis \
python313-lxml \
python313-matplotlib \
python313-numba \
python313-numexpr \
python313-odfpy \
python313-openpyxl \
python313-pandas \
python313-psycopg2 \
python313-pyreadstat \
python313-pytest \
python313-pytest-xdist \
python313-scipy \
python313-tables \
python313-tabulate \
python313-xarray \
python313-xlrd \
python313-zstandard"

inherit rpm
