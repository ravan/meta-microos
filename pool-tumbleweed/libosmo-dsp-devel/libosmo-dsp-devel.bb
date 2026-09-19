SUMMARY = "Headers for the Osmocom SDR DSP primitives"
DESCRIPTION = "libosmo-dsp is a C language library for common DSP (Digital \
Signal Processing) primitives for SDR (Software Defined Radio). \
This subpackage contains the header files."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "libosmo-dsp-devel-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "9b46236c04766307d667987d6fae5f00fab450ac8b8680a4b6922fbff85ffcecdb71ed042716b0804788743aff56e08c6b8f7418ea46806026c0613603415cc4"

RPROVIDES:${PN} += "libosmo-dsp-devel \
pkgconfig-libosmodsp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmodsp0"

inherit rpm
