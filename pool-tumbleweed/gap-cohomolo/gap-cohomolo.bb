SUMMARY = "GAP: Cohomology groups of finite groups on finite modules"
DESCRIPTION = "The cohomolo package is a GAP interface to some C programs for \
computing Schur multipliers and covering groups of finite groups and \
first and second cohomology groups of finite groups acting on finite \
modules."
LICENSE = "GPL-2.0-only"

PV = "1.7.1"

RPM_NAME = "gap-cohomolo-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "cb0bc2a3ac3c57ae3d0b043661c20edefde5cc19887c28b38425f7b63b049a6f69e53ecaaaeb84daef56532869f34b59e916a1a8ad465dc266bf25de0317bca0"

RPROVIDES:${PN} += "gap-cohomolo"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
libc.so.6"

inherit rpm
