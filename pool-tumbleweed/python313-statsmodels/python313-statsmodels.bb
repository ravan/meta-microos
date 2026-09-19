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

RPM_NAME = "python313-statsmodels-0.14.6-1.5.aarch64.rpm"
RPM_HASH = "468e4e7e9007a7f027f99828a002f893b42b358e8f4ccdd564767f71be9aa3ec07e850cfbfbfb6feb6e0bdb4c4f925dac2ccce67265667575fd0770fe75c694c"

RPROVIDES:${PN} += "python3-statsmodels \
python3.13dist-statsmodels \
python313-statsmodels \
python3dist-statsmodels"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy \
python313-packaging \
python313-pandas \
python313-patsy \
python313-scipy"

inherit rpm
