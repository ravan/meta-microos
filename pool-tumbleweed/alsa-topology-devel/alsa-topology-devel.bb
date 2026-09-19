SUMMARY = "Header files for ALSA topology development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require ALSA topology."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.16.1"

RPM_NAME = "alsa-topology-devel-1.2.16.1-2.1.aarch64.rpm"
RPM_HASH = "77923ea5fb2ff1ba9f55ce9b514515574cbc4342272549cebae027ce8b7315fa49031d31d33874706c009063f622f65dc8687d20d7a3c7e65ba0dd6f2b98f6e1"

RPROVIDES:${PN} += "alsa-topology-devel \
pkgconfig-alsa-topology"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
libatopology2 \
pkgconfig-alsa"

inherit rpm
