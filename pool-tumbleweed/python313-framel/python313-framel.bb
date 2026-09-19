SUMMARY = "Python bindings for framel, a gravitational wave frame data library"
DESCRIPTION = "The Frame Library is a software dedicated to frame data manipulation including \
file input/output. \
 \
This package provides the python bindings for framel."
LICENSE = "LGPL-2.1-or-later"

PV = "8.48.4"

RPM_NAME = "python313-framel-8.48.4-2.7.aarch64.rpm"
RPM_HASH = "cfc1eef1d620b8d6f49383dd846ceeda9720cccd95c8474cdc8a7fa03b5b9a29850d5d1351140fcd94db9c40c2c42252e91d3f835363311cfce988b04f649810"

RPROVIDES:${PN} += "python3-framel \
python3.13dist-framel \
python313-framel \
python3dist-framel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
