SUMMARY = "Pythonified linux asm-generic/ioctl.h"
DESCRIPTION = "Functions to compute fnctl.ioctl's opt argument."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "python314-ioctl-opt-1.3.1-1.2.noarch.rpm"
RPM_HASH = "45acc1a39ef5bf47f7e25f8d48b2b40687aaf48394c99a8c552efa3e081150696dcb047668bbdf918c0fe6b9ff73605bcce6ab761637c51a92da8259388fa544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ioctl-opt \
python314-ioctl-opt \
python3dist-ioctl-opt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
