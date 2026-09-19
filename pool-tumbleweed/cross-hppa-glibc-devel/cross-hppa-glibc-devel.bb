SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "cross-hppa-glibc-devel-2.44-2.1.noarch.rpm"
RPM_HASH = "730180f3e91f543af40f8ec1bea85adbf5f4819e8a7eb4d8214b9db8d28760e1890630f396d530dddfd82f71fe725d5e31ef159fab00cea778a3969796eefe54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-hppa-glibc-devel"

RDEPENDS:${PN} += "cross-hppa-linux-glibc-devel"

inherit rpm
