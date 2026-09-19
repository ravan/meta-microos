SUMMARY = "Active Directory Users and Computers for YaST"
DESCRIPTION = "The Active Directory Users and Computers for YaST module provides tools for \
creating and modifying Users, Groups, and Computer objects in Active Directory."
LICENSE = "GPL-3.0-only"

PV = "2.2"

RPM_NAME = "yast2-aduc-2.2-1.25.noarch.rpm"
RPM_HASH = "9d877682bd72cecdfad25051b162231bb059e334c8310ec4ed63767a6bb80b5f09479db5622598b8f159e71c58e87db869bfd0b690bb01903b5dc70f7b48d614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast-aduc \
yast2-aduc"

RDEPENDS:${PN} += "/usr/bin/env \
krb5-client \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
