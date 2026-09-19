SUMMARY = "Samba Group Policy"
DESCRIPTION = "The samba-gpupdate package provides the samba-gpupdate tool for applying \
Group Policies on a Samba client."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-gpupdate-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "fba6794c1cfd0d3b56391147efe08ce5e15fff73a90ab14a1f558241e50b2991266902275d37f92fd53bd106d90573f24803aab56ab788bf19e2052e2124c3d1"

RPROVIDES:${PN} += "samba-gpupdate"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
samba-ldb-ldap \
samba-python3"

inherit rpm
