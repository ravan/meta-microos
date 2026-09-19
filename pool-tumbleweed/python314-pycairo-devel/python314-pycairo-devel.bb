SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.29.1"

RPM_NAME = "python314-pycairo-devel-1.29.1-1.1.aarch64.rpm"
RPM_HASH = "2c6e3ce1fdc966493f4b473db9b29071c3e5b6936b86bf03cb9edcf6880ee1d5d25f04d496433af0ac8d71362a0d282f33fa8daba8f1f73e42d4f23d7f49f735"

RPROVIDES:${PN} += "python314-cairo-devel \
python314-pycairo-devel"

RDEPENDS:${PN} += "python314-devel \
python314-pycairo \
python314-pycairo-common-devel"

inherit rpm
