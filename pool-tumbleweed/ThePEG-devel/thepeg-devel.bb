SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the header and source files needed for development with \
ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.3.0"

RPM_NAME = "ThePEG-devel-2.3.0-2.3.aarch64.rpm"
RPM_HASH = "5072d83d77b33d7ccc5d668ca810f378e7d48a217f7e1fda78188a588e068097bcc04621dde905e2fa0543e454b7619156b656a1c4a1f73f7b5cefd80af1f762"

RPROVIDES:${PN} += "ThePEG-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libThePEG.so.30 \
libThePEG30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
