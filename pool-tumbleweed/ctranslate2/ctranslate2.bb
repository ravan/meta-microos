SUMMARY = "Library for efficient inference with Transformer models"
DESCRIPTION = "CTranslate2 is a C++ and Python library for efficient inference with Transformer models. \
 \
NOTE: hardware accelaration is currently disabled in this package for license reasons"
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "ctranslate2-4.6.0-2.5.aarch64.rpm"
RPM_HASH = "8e7cf95ca9e4001dde513fa3967bf046f0fe81a857926cfe400112230484143755bf696bc987be144e9a5d2e11edd9388a95332966c6abc26adc8ef4253cace8"

RPROVIDES:${PN} += "ctranslate2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libctranslate2.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
