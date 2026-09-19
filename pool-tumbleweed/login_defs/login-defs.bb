SUMMARY = "The login.defs configuration file"
DESCRIPTION = "This package contains the default login.defs configuration file \
as used by util-linux, pam and shadow."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "login_defs-4.20.2-2.1.noarch.rpm"
RPM_HASH = "944689b3fcfb044c7926ad608132e65fd5b5b9f4cd5145e29ceae51a493762b21bebe6053284ee6e2bc83a6ec53aa00ee9ab4dc35af4c65498ea0befd9035682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "login-defs \
login-defs-support-for-pam \
login-defs-support-for-util-linux"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
