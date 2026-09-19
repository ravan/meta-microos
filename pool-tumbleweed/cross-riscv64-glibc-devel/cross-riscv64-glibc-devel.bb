SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "cross-riscv64-glibc-devel-2.44-2.1.noarch.rpm"
RPM_HASH = "de65f178ce86cbb1e1ee846e2d50a9aa26a75bda496ac916930fb60525ada2b396ca9ecec308baab5f5fc5422af3aa27a5d11dc8f54eee49d51870450b470440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-glibc-devel"

RDEPENDS:${PN} += "cross-riscv64-linux-glibc-devel"

inherit rpm
