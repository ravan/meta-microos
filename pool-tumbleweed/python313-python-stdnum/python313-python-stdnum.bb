SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2"

RPM_NAME = "python313-python-stdnum-2.2-1.2.noarch.rpm"
RPM_HASH = "37cc31ec6dd7999bba1bccbd57fcf3c70fa5b919386e824613b56c41963860a4c0e3a099127967a162470555e63e7cd07644c9491bffb9dcef97cd0714ae7ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-stdnum \
python3.13dist-python-stdnum \
python313-python-stdnum \
python3dist-python-stdnum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
