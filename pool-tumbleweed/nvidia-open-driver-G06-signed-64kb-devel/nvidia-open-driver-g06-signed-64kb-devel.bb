SUMMARY = "Devel Package to nvidia-open-driver-G06-signed"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G06-signed"
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-64kb-devel-580.178.04-1.5.aarch64.rpm"
RPM_HASH = "a28176bf7e9387e81d5b79eb6ed0689aae681e34362574e86c54e1d01eee09f6915a823277229a7c523f5c4a330b8994d48f622b3338cbd92be7c0180dafb9fc"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-64kb-devel \
nvidia-open-driver-G06-signed-64kb-devel-gfx"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
