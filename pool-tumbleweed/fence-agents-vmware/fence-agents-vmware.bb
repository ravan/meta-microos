SUMMARY = "Fence agent for VMWare with VI Perl Toolkit or vmrun"
DESCRIPTION = "Fence agent for VMWare accessed with VI Perl Toolkit or vmrun."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-vmware-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "225559f6dc8c988bda73eb5808471fec7c2d0ee02c627a2882f3d655c32821fe660ce17a7f15f65379f924d704e7495d116798f01f9277a41e6e1412f2847d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-vmware"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3-pexpect"

inherit rpm
