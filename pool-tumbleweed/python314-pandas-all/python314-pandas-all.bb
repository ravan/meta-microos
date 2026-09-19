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
You can install them directly through `pip3.14 install --user`, if needed."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-all-3.0.5-2.2.noarch.rpm"
RPM_HASH = "e0356c2520ab5bc5050740b3e93c9cc783e0ea4bbb986031d1502aee11daea34613f38feeee71f10e0a9f230e63b0943b6be8a081a3a78b1bf50e8e3c6975ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-all"

RDEPENDS:${PN} += "python314-Bottleneck \
python314-Jinja2 \
python314-PyMySQL \
python314-PyQt5 \
python314-QtPy \
python314-SQLAlchemy \
python314-XlsxWriter \
python314-beautifulsoup4 \
python314-blosc \
python314-fsspec \
python314-gcsfs \
python314-html5lib \
python314-hypothesis \
python314-lxml \
python314-matplotlib \
python314-numba \
python314-numexpr \
python314-odfpy \
python314-openpyxl \
python314-pandas \
python314-psycopg2 \
python314-pyreadstat \
python314-pytest \
python314-pytest-xdist \
python314-scipy \
python314-tables \
python314-tabulate \
python314-xarray \
python314-xlrd \
python314-zstandard"

inherit rpm
