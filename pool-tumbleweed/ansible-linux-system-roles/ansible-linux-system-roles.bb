SUMMARY = "Collection of Ansible roles for Linux system management"
DESCRIPTION = "Linux System Roles is a collection of Ansible roles and modules that provide a \
stable and consistent configuration interface to manage Linux systems. These \
roles are designed to be used with Ansible to configure and maintain various \
aspects of a Linux system."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "ansible-linux-system-roles-1.5.0-1.1.noarch.rpm"
RPM_HASH = "43759613fe2a0f6d369164d461ff919dd391cbb932e080d29dfe32a8bfd6c06c4a82d626038329e10b58be7ee6fdf8a81623b86f41f8cea78acfb8403c7787bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-linux-system-roles"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
ansible \
ansible-core"

inherit rpm
