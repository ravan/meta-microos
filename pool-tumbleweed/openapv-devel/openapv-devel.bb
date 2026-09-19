SUMMARY = "Development files for openapv"
DESCRIPTION = "Development files for openapv."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.0"

RPM_NAME = "openapv-devel-0.3.0.0-1.3.aarch64.rpm"
RPM_HASH = "a79c0c05184a44091e24e6c7191153a8df69e0b32b1f4267bf3c982daf6de0e52979b49ea0d1414cea15101ae786f9074b3533a3c02bd591ff672c45ef8b33e8"

RPROVIDES:${PN} += "openapv-devel \
pkgconfig-oapv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboapv3"

inherit rpm
