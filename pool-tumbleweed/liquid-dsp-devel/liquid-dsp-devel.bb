SUMMARY = "Development files for the liquid-dsp library"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libliquid."
LICENSE = "MIT"

PV = "1.8.2"

RPM_NAME = "liquid-dsp-devel-1.8.2-1.1.aarch64.rpm"
RPM_HASH = "0146a0813c9a0412855b71d774ae48c3ff1056c7cd7f6dd0e0139c476ea5754112fcda5d1cdb454765b20a752c9954817e6ac01974b6bf4502b7006940f74644"

RPROVIDES:${PN} += "cmake-liquid \
libliquid-devel \
liquid-dsp-devel \
pkgconfig-liquid-dsp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libliquid1"

inherit rpm
