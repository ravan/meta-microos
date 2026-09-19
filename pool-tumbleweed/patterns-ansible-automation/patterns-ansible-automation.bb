SUMMARY = "Ansible automation engine and Linux system roles"
DESCRIPTION = "Ansible automation engine with SUSE Linux system roles for configuration \
management of SUSE Linux Enterprise systems. Includes roles for network, \
timesync, firewall, ssh, selinux, podman, cockpit, and more. \
 \
Install this pattern to manage your SLES fleet with Ansible."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "patterns-ansible-automation-1.0.0-2.2.noarch.rpm"
RPM_HASH = "bf430367f7a6cecb0091721574abbdabf5f729d9e05943cf88f8f3495b0e86003a0dcc0a658247669d2914ed992a8d03a8c5cbd111aaa6690438d509d5809f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-ansible-automation"

RDEPENDS:${PN} += "ansible \
ansible-core \
ansible-linux-system-roles"

inherit rpm
