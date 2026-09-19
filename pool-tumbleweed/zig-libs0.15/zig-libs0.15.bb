SUMMARY = "Zig Standard Library"
DESCRIPTION = "Zig 0.15.2 Standard Library"
LICENSE = "Apache-2.0-with-LLVM-exception & APSL-1.1 & APSL-2.0 & Beerware & BSD-1-Clause & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CDDL-1.0 & GFDL-1.1-or-later & GPL-1.0-or-later-with-Linux-syscall-note & GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later-with-Linux-syscall-note & GPL-3.0-or-later-with-GCC-exception-3.1 & Inner-Net-2.0 & ISC & LGPL-2.0-or-later-with-Linux-syscall-note & LGPL-2.1-only-with-Linux-syscall-note & LGPL-2.1-or-later & LGPL-2.1-or-later-with-Linux-syscall-note & MIT & MIT-CMU & NCSA & RSA-MD & SUSE-Public-Domain & ZPL-2.1"

PV = "0.15.2"

RPM_NAME = "zig-libs0.15-0.15.2-3.1.noarch.rpm"
RPM_HASH = "168a17a10ba788bb792463bcc57878cb50b0a94e8d30ab10911deaf2780f5ea503264f73ee43751e155f99ee3aa492861942a815fb539dea9359ae9e519140c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zig-libs \
zig-libs-implementation \
zig-libs0.15"

RDEPENDS:${PN} += ""

inherit rpm
