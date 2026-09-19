SUMMARY = "Devel Package to nvidia-open-driver-G06-signed"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G06-signed"
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-default-devel-580.178.04-1.5.aarch64.rpm"
RPM_HASH = "c2cb898481930fe7e774157a3d2da5d4c94171f918e5c6d031d7a2f0f7380120e5a93d94ca41fd47a893abd10282af68f46c0ca2e7f7034d25c208d573279e4a"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-default-devel \
nvidia-open-driver-G06-signed-default-devel-gfx"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
