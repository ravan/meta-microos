SUMMARY = "Selinux support for forgejo"
DESCRIPTION = "This package adds SELinux enforcement to forgejo."
LICENSE = "GPL-3.0-or-later"

PV = "16.0.3"

RPM_NAME = "forgejo-selinux-16.0.3-1.1.noarch.rpm"
RPM_HASH = "2c0c419ef3da936b77c2547705dda323cc48261defea696e1d6fc630ad0bcef4adfa246134a77cbef5159b6671ba065083db6f0899e3c279576e436969fbb4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forgejo-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
forgejo \
selinux-policy-targeted"

inherit rpm
