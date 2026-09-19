SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "cross-x86_64-glibc-devel-2.44-2.1.noarch.rpm"
RPM_HASH = "d1f55a7833abdaa871dad5ffff4a3eacc733e47cc1c2aabb030af5e5d4dfa2f92f68bfd14d65a9da79564e4e4d98042e1af2449e9b2eaf710b5f15f7c22b7aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-x86-64-glibc-devel"

RDEPENDS:${PN} += "cross-x86-64-linux-glibc-devel"

inherit rpm
