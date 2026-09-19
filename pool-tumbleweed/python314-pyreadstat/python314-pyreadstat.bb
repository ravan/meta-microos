SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.3.5"

RPM_NAME = "python314-pyreadstat-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "409a3871d3a8cfaaf0da2124ecca1411710779aba72e1b6d2fca1db1d2f611232c7c819d775cdda4aba372b0f5260e19540bf7ea70682178e6c589e2b7da4cb8"

RPROVIDES:${PN} += "python3.14dist-pyreadstat \
python314-pyreadstat \
python3dist-pyreadstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
python-abi \
python314-narwhals \
python314-numpy \
python314-pandas"

inherit rpm
