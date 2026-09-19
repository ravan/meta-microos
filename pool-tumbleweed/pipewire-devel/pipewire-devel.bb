SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-devel-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "b6d80be634d20dad4697d6dda380ec1d101a4dbe3d857c0e1630bbef2664e46ab18943b145227ba6bb35e79f62e1ecb7629f90db1772483a254a8dbf3266ec12"

RPROVIDES:${PN} += "pipewire-devel \
pkgconfig-libpipewire-0.3 \
pkgconfig-libspa-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipewire-0-3-0 \
pkgconfig-libspa-0.2"

inherit rpm
