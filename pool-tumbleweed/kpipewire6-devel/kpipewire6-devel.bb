SUMMARY = "Development files for kpipewire6"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides the development files needed to build applications \
which use KPipeWire."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "kpipewire6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "94e54687311142b1f9e183b10bc082c4ab4eac0b5b45236246ddf6792bf5949f1f29a62287adcb8f95c4f4f7c8be3a6f7e5cbaf8741ea9866962e6489dc28c88"

RPROVIDES:${PN} += "cmake-KPipeWire \
kpipewire6-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlIntegration \
kpipewire6-imports \
libKPipeWire6 \
libKPipeWireDmaBuf6 \
libKPipeWireRecord6 \
pkgconfig-epoxy \
pkgconfig-libpipewire-0.3"

inherit rpm
