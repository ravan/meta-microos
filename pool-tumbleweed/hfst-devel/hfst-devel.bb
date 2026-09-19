SUMMARY = "Development files for the Helsinki Finite-State Transducer"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology. \
 \
This subpackage contains the files necessary to build programs that \
want to make use of the HFST library."
LICENSE = "GPL-3.0-only"

PV = "3.17.3"

RPM_NAME = "hfst-devel-3.17.3-1.1.aarch64.rpm"
RPM_HASH = "e60acab35d2246da3021acabbd8e0dd867ee8d9607cc2cfa693d29db4b3106fdc5efc3db0025dc02271972e1b911a0aa557e916433308701236b36d5fee4de67"

RPROVIDES:${PN} += "hfst-devel \
pkgconfig-hfst \
pkgconfig-hfst-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhfst-c57 \
libhfst57"

inherit rpm
