SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "python314-lazy-loader-0.5-1.3.noarch.rpm"
RPM_HASH = "97e23649fb4e4adc59c7bba263ec96e355298c24de8fdfe34fd2658a4b80d0c8ff60e85eb06b16ab677a55908d13281d4508c1f39f50ad2a46d85f4afbbb6282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazy-loader \
python314-lazy-loader \
python3dist-lazy-loader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
