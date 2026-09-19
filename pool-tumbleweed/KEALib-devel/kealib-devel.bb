SUMMARY = "Header files for KEALib"
DESCRIPTION = "KEALib provides an implementation of the GDAL data model. \
 \
Development Libraries for KEALib."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "KEALib-devel-1.6.2-1.3.aarch64.rpm"
RPM_HASH = "b924c53aa803cc1cace6116ee2acac1d085e057d73f2acbe048db619fbd2a14df18971a0da1262f789b229531bb2b456001d7afcab95ea3e98c1867699081076"

RPROVIDES:${PN} += "KEALib-devel \
cmake-Kealib \
cmake-libkea \
libkea-devel \
libkea1-6-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libkea1-6"

inherit rpm
