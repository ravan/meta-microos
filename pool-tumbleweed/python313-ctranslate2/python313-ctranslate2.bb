SUMMARY = "Library for efficient inference with Transformer models"
DESCRIPTION = "CTranslate2 is a C++ and Python library for efficient inference with Transformer models. \
 \
NOTE: hardware accelaration is currently disabled in this package for license reasons"
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python313-ctranslate2-4.6.0-2.6.aarch64.rpm"
RPM_HASH = "19b21df05633364a4206917aeb3f410045495874ed3d677e91ea48d49b70e5edc18184b3edca84569afbfd0e2e432690e2446100bf46748d13fb89c4a316559b"

RPROVIDES:${PN} += "python3-ctranslate2 \
python3.13dist-ctranslate2 \
python313-ctranslate2 \
python3dist-ctranslate2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctranslate2.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
