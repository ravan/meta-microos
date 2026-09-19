SUMMARY = "Portable file system cache diagnostics and control"
DESCRIPTION = "A tool for learning about and controlling the file system \
cache of unix and unix-like systems."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "vmtouch-1.3.1-1.21.aarch64.rpm"
RPM_HASH = "de2ae43a62faffed2472a41e41f3d2e2f0b75cc13c1310188e7521e184408418bdd5859c6df9de1a65ec9b90e8da4906d30dee09be2d9f86aa60042113da0c2b"

RPROVIDES:${PN} += "vmtouch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
