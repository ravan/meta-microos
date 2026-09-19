SUMMARY = "Library for efficient inference with Transformer models"
DESCRIPTION = "CTranslate2 is a C++ and Python library for efficient inference with Transformer models. \
 \
NOTE: hardware accelaration is currently disabled in this package for license reasons"
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python314-ctranslate2-4.6.0-2.6.aarch64.rpm"
RPM_HASH = "9ca2d29b9554b9df01a32b70cc713ccbf432efa9ea5d2d5ad83e4bab58869296b7fecca3fc7d686f1f37e71c49c79d710c39c58e587e2b93e212123998a708fa"

RPROVIDES:${PN} += "python3.14dist-ctranslate2 \
python314-ctranslate2 \
python3dist-ctranslate2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctranslate2.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
