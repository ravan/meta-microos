SUMMARY = "Headers for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the headers and development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.29.1"

RPM_NAME = "python-pycairo-common-devel-1.29.1-1.1.aarch64.rpm"
RPM_HASH = "b558957e761784d9b06d502fd66fe4dc941eca74c8b10175150438a535d49c4937b8ff14fedf25a24575257f5026b4f43b2f619f25019e7abd32dd956036fb8c"

RPROVIDES:${PN} += "pkgconfig-py3cairo \
python-cairo-common-devel \
python-pycairo-common-devel \
python313-cairo-common-devel \
python313-cairo-devel \
python313-pycairo-common-devel \
python314-cairo-common-devel \
python314-cairo-devel \
python314-pycairo-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cairo-devel \
pkgconfig-cairo"

inherit rpm
