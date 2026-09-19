SUMMARY = "Zig Standard Library"
DESCRIPTION = "Zig 0.16.0 Standard Library"
LICENSE = "Apache-2.0-with-LLVM-exception & APSL-1.1 & APSL-2.0 & Beerware & BSD-1-Clause & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CDDL-1.0 & GFDL-1.1-or-later & GPL-1.0-or-later-with-Linux-syscall-note & GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later-with-Linux-syscall-note & GPL-3.0-or-later-with-GCC-exception-3.1 & Inner-Net-2.0 & ISC & LGPL-2.0-or-later-with-Linux-syscall-note & LGPL-2.1-only-with-Linux-syscall-note & LGPL-2.1-or-later & LGPL-2.1-or-later-with-Linux-syscall-note & MIT & MIT-CMU & NCSA & RSA-MD & SUSE-Public-Domain & ZPL-2.1"

PV = "0.16.0"

RPM_NAME = "zig-libs0.16-0.16.0-2.1.noarch.rpm"
RPM_HASH = "ed46e4b55634a97c3ff553ff71c65865438f577ff2cef795a5c9cbdef7313d34f0096a23aff95fe79025106e3bb6aa58c0d9ee24374c0126b74ec44a742d8a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zig-libs \
zig-libs-implementation \
zig-libs0.16"

RDEPENDS:${PN} += ""

inherit rpm
