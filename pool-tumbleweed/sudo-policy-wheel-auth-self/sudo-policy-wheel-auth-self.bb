SUMMARY = "Users in the wheel group can authenticate as admin"
DESCRIPTION = "Sudo authentication policy that allows users in the wheel group to \
authenticate as root with their own password"
LICENSE = "ISC"

PV = "1.9.17p2"

RPM_NAME = "sudo-policy-wheel-auth-self-1.9.17p2-4.1.noarch.rpm"
RPM_HASH = "abe6eb452bdc423ff38ff1ac0f0b557f283df6ddaf697dd4b055348921084053f9705f837c48541f091e1f3850b398e7d6d83a444db39422e7e077f253d3970d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sudo-policy-wheel-auth-self"

RDEPENDS:${PN} += "group-wheel \
sudo"

inherit rpm
