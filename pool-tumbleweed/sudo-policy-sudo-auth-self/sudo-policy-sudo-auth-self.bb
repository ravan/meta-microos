SUMMARY = "Users in the sudo group can authenticate as admin"
DESCRIPTION = "Sudo authentication policy that allows users in the sudo group to \
authenticate as root with their own password"
LICENSE = "ISC"

PV = "1.9.17p2"

RPM_NAME = "sudo-policy-sudo-auth-self-1.9.17p2-4.1.noarch.rpm"
RPM_HASH = "8f44ce5aa0d856a60b26057da02e48dd07b7c31612b6e2cbd020186897fa8187d7ae9b454da4ce201b17a22c40848ee62bade6e886a0641d36cd2ed39dfffe38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sudo-policy-sudo-auth-self"

RDEPENDS:${PN} += "group-sudo \
sudo"

inherit rpm
