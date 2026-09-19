SUMMARY = "SELinux policy documentation"
DESCRIPTION = "SELinux policy documentation and man page package"
LICENSE = "GPL-2.0-or-later"

PV = "20260910"

RPM_NAME = "selinux-policy-doc-20260910-1.1.noarch.rpm"
RPM_HASH = "f623557eb65e7b611e5b401f0dee49d1228cafb1e6a705365a5b6d3b2b78dd2f8f931fe4fe81f54cd2d356baa6d820435a89f1acef8952400fe935fe9b03d915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-doc"

RDEPENDS:${PN} += "/usr/bin/xdg-open \
selinux-policy"

inherit rpm
