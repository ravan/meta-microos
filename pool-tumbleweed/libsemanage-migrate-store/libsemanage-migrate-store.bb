SUMMARY = "SELinux Policy Store Migration"
DESCRIPTION = "In version 2.4 of libsemanage, libsepol, and policycoreutils, the policy \
module store was moved from /etc/selinux/<store>/modules/ to \
/var/lib/selinux/<store>/. Once the libraries are upgraded, all policy \
stores must be migrated before any commands that modify or use the store \
(e.g. semodule, semanage) can be executed."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsemanage-migrate-store-3.11-1.2.aarch64.rpm"
RPM_HASH = "d8de689d49e17fe2acba21d10866f8bbee777ed162614b86c5784a3e16919514b95b50d01ed299e5d342a83f45bc1450d4c414e8c1e752dc0b55f2ac8a9bc145"

RPROVIDES:${PN} += "libsemanage-migrate-store"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
