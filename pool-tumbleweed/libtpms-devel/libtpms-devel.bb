SUMMARY = "Include files for libtpms"
DESCRIPTION = "Libtpms header files and documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "libtpms-devel-0.10.2-1.3.aarch64.rpm"
RPM_HASH = "71ed781506a22d10bb946a86b1e06611e518326e9f8ba05ea09c82bbc4db38767a4833baf72ea0e4263b61b6e744d8bef3f429e7e4e2f9f7d8851fb6e87b13e6"

RPROVIDES:${PN} += "libtpms-devel \
pkgconfig-libtpms"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenssl-devel \
libtpms0 \
mozilla-nspr-devel"

inherit rpm
