SUMMARY = "Helper package for transactional-update with SELinux"
DESCRIPTION = "Helper package for transactional-update to enable SELinux. \
This package should NEVER be installed alone, only by \
transactional-update if required!"
LICENSE = "GPL-2.0-or-later"

PV = "20201215"

RPM_NAME = "selinux-targeted-setup-20201215-3.10.noarch.rpm"
RPM_HASH = "5bf221a8ed7f05f197901fd23c3a98a4518db93eca24642f89a46fdb10157bf483f7ce84a296ff1db3548abf7c1ae2469f503178e7a1291659998d82305551bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-targeted-setup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
selinux-policy-targeted"

inherit rpm
