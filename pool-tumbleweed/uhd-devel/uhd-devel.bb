SUMMARY = "Development files for uhd"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains all the necessary tools, examples and include \
files for development with the UHD Driver."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "uhd-devel-4.10.0.0-2.1.aarch64.rpm"
RPM_HASH = "6e4783796c92efcff3c0b8328c59f8cc0eb30701bc5a9fd47db50aaf209d27f4fd1d45c3931e535cfbcbf19ddffd0cf115230a594e31dabd4a31a0d55a9008c9"

RPROVIDES:${PN} += "cmake-UHD \
pkgconfig-uhd \
uhd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-chrono-devel \
libboost-date-time-devel \
libboost-filesystem-devel \
libboost-headers-devel \
libboost-program-options-devel \
libboost-serialization-devel \
libboost-test-devel \
libboost-thread-devel \
libuhd4-10-0"

inherit rpm
