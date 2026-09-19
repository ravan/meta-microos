SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.3.5"

RPM_NAME = "python313-pyreadstat-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "ea01757da4428cd801d7879948ce621805c9055cf24a239d34957bfbb28165ecf1df19e470fa0c6bd2e0337f8bcf1773456294021aff9123ccd8c83c3338648e"

RPROVIDES:${PN} += "python3-pyreadstat \
python3.13dist-pyreadstat \
python313-pyreadstat \
python3dist-pyreadstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
python-abi \
python313-narwhals \
python313-numpy \
python313-pandas"

inherit rpm
