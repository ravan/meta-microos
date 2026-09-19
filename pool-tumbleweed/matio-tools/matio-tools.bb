SUMMARY = "Command line tools for matio"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.30"

RPM_NAME = "matio-tools-1.5.30-1.4.aarch64.rpm"
RPM_HASH = "044da9a416d9786f2d1c70c4f0bf64a42099dfe428619eecee0f08b82c25acb914db6418bb99c29474824e1c0726a61d7139756f733f173ee8ef21ec3eb91340"

RPROVIDES:${PN} += "matio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5 \
libm.so.6 \
libmatio.so.14 \
libmatio14"

inherit rpm
