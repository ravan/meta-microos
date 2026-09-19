SUMMARY = "Open Knowledgebase of Interatomic Models"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the models from openkim.org."
LICENSE = "Apache-2.0 & CDDL-1.0 & MPL-2.0 & GPL-3.0-only & LGPL-3.0-only"

PV = "2021.08.11"

RPM_NAME = "openkim-models-2021.08.11-1.18.aarch64.rpm"
RPM_HASH = "2e98b6af32a6b06d87048d4632eed168f9876959634fe17148dc3c4e51dd5d053074a9d194979dcfbcfc5c4500b06264fafeeffc776aae820cabd747265bb2c6"

RPROVIDES:${PN} += "libkim-api-model-driver.so \
libkim-api-portable-model.so \
libkim-api-simulator-model.so \
openkim-models"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libkim-api.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
