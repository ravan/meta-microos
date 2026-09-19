SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python313-unicodecsv-0.14.1-3.5.noarch.rpm"
RPM_HASH = "0ca3101a777fce6d10452571ec92b29e1af6b459952fd459cf7949ddf0db67241c971ecb9c58dfbd2c4cfaaf9ab15f8db447af23e8fd7c56611fb891bc677dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unicodecsv \
python3.13dist-unicodecsv \
python313-unicodecsv \
python3dist-unicodecsv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
