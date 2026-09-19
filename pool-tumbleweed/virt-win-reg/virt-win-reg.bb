SUMMARY = "Access and modify the Windows Registry of a Windows VM"
DESCRIPTION = "Virt-win-reg lets you look at and modify the Windows Registry of \
Windows virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.56.0"

RPM_NAME = "virt-win-reg-1.56.0-1.2.noarch.rpm"
RPM_HASH = "95f99ac12f3e109197bdf976aff23efe17a668d4ae9232e6098c2b8d06d1ad1dc233ecd4c93141710735676e81b0f5e2a427d4f865afeff6d6d2f57e42be8666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-win-reg"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
