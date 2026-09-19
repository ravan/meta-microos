SUMMARY = "A Python module that allows users to explore data"
DESCRIPTION = "Statsmodels is a Python module that allows users to explore data, \
estimate statistical models, and perform statistical tests. \
An extensive list of descriptive statistics, statistical tests, \
plotting functions, and result statistics are available for different \
types of data and each estimator. Researchers across fields may find \
that statsmodels fully meets their needs for statistical computing \
and data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "0.14.6"

RPM_NAME = "python314-statsmodels-0.14.6-1.5.aarch64.rpm"
RPM_HASH = "e5a5d3fea461bd81ab053a8a1fe6aacb4d307c384b06963532b23585f04e2fb210acb7f8c7694bbaabebd504383ca8ddc279d41559959abefeed5817588c1b8a"

RPROVIDES:${PN} += "python3.14dist-statsmodels \
python314-statsmodels \
python3dist-statsmodels"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy \
python314-packaging \
python314-pandas \
python314-patsy \
python314-scipy"

inherit rpm
