SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kcalutils-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3cc052c30b05700792f90f16b83189da4df0b64074b4fda0ea5283ce436ed44bb86ca1ed59c14e5ad7da0a88c953c9a6ceb0b3f2a3a6e3c48311647c8f0aa243"

RPROVIDES:${PN} += "kcalutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6IconThemes.so.6 \
libKF6TextTemplate.so.6 \
libKPim6CalendarUtils.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
