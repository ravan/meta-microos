SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-branding-upstream-2.14-19.1.noarch.rpm"
RPM_HASH = "f22f46d30277601146e0384761ffa4704b7cd92c8a46a01b3f2ba816fd9382ecea28e3fca0aab8c338d9974912cb33e2cd011edc8b026b9450a00ad7dfe586b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-branding-upstream"

RDEPENDS:${PN} += "grub2-common"

inherit rpm
