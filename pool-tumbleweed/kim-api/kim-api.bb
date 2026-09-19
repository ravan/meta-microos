SUMMARY = "Open Knowledgebase of Interatomic Models KIM API"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package can be used to load all the files (libraries, headers, and \
documentation) for the KIM-API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "kim-api-2.3.0-2.9.aarch64.rpm"
RPM_HASH = "398ae67f044113201dcecd4a7854f501f20f6263198a7a8622007b9c01d2665bc05b4e8848b49b8218d5282e6764e047352cf18ee041f159d2bfea5863217ad6"

RPROVIDES:${PN} += "kim-api"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkim-api.so.2 \
libkim-api2 \
libstdc++.so.6"

inherit rpm
