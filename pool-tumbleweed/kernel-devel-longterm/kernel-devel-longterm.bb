SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
 \
Source Timestamp: 2026-09-12 22:20:24 +0000 \
GIT Revision: 5fd8dd86aa6ed38923322b5ebd90adc85e8e7c55 \
GIT Branch: slowroll"
LICENSE = "GPL-2.0-only"

PV = "6.18.51"

RPM_NAME = "kernel-devel-longterm-6.18.51-1.1.noarch.rpm"
RPM_HASH = "b95e4c04999dedcb9923e471f06ad01a4ee3d258b4c3805b31c82ab8ed78a93350ced2c2ebbf4a1be8f51909b9833a48069aee530654bb15fecc773e854665d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel-longterm \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-macros"

inherit rpm
