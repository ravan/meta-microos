SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification. \
 \
This package provides the fasttext library."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "libfasttext0-0.9.2-6.7.aarch64.rpm"
RPM_HASH = "a20f0e3b76f598f6561aae657539c5d1fbadc360f5b8c1043061595f39e5cc13445677ebb2308460ae2c9fe7692353afe5c32b0032230ef9ad4cf567bd294fad"

RPROVIDES:${PN} += "libfasttext.so.0 \
libfasttext0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
