SUMMARY = "Fence agent for virtual machines based on libvirt"
DESCRIPTION = "Fence agent for virtual machines that are accessed via SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-virsh-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "4fa5094b9e52f7b536f10dfe8ccac416fde721621f0af53e8aa2dd17b96be862895216b68174cba579faeeb4ba8bf159f93ade723c08215a8efc4b2dba160384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-virsh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/virsh \
fence-agents-common \
openssh-clients"

inherit rpm
