SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-devel-1.14.1-2.6.aarch64.rpm"
RPM_HASH = "90df50056b8157b1de74204631e3207c5b3a23e1f955e3412dba9378fd50184a65ee1154e1ae3e3b97826de4669d17cfd91baba7e24a8cb1f6f6798fce5fdcdf"

RPROVIDES:${PN} += "augeas-devel \
pkgconfig-augeas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaugeas0 \
libfa1 \
pkgconfig-libxml-2.0"

inherit rpm
