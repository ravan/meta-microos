SUMMARY = "Enable xrdp to generate sound with pipewire"
DESCRIPTION = "This module allows xrdp to generate sound on a pipewire-based system."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "pipewire-module-xrdp-0.2-1.1.aarch64.rpm"
RPM_HASH = "45cdbc20e436d6e6f811ed8d709a7d9ff20c75b187eb8c8475295fc6f8178d6ec15dc7672d1ea2400eb5970e012ba26b0d7d3750164802815893056a74315572"

RPROVIDES:${PN} += "config-pipewire-module-xrdp \
libpipewire-module-xrdp.so \
pipewire-module-xrdp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipewire-0.3.so.0"

inherit rpm
