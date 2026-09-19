SUMMARY = "Frei0r plugin API for video sources and filters"
DESCRIPTION = "Frei0r is a minimalistic plugin API for video sources and filters. The \
behaviour of the effects can be controlled from the host by simple \
parameters. The intent is to solve the recurring reimplementation or \
adaptation issue of standard effects."
LICENSE = "GPL-3.0-or-later"

PV = "3.5.0"

RPM_NAME = "frei0r-plugins-devel-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "93a14ac0ab460dfea13a2d84bcb3741b50f3930a95105fd0ab0029b3f3a7c4299af8ad87a4500bfa4c276b5f69d81b90ea035207bb65f5ba797888d42b6259d3"

RPROVIDES:${PN} += "frei0r-plugins-devel \
pkgconfig-frei0r"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
