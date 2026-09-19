SUMMARY = "Modern UI for Ansible"
DESCRIPTION = "Ansible Semaphore is a modern UI for Ansible. It lets you easily run Ansible \
playbooks, get notifications about fails, control access to deployment system. \
 \
If your project has grown and deploying from the terminal is no longer for you \
then Ansible Semaphore is what you need."
LICENSE = "MIT"

PV = "2.19.11"

RPM_NAME = "semaphore-2.19.11-1.1.aarch64.rpm"
RPM_HASH = "da4bf11ba9df892b18aa4c3cb08187dd4a2b3300623d8be871b0160e2ec745ef22d5f33d8ca7c0a0db6f306fd53a35f2f60d4fb3b3980ca3b5c1cd1aa259e856"

RPROVIDES:${PN} += "config-semaphore \
semaphore"

RDEPENDS:${PN} += "/usr/bin/sh \
ansible-core \
git-core \
libc.so.6"

inherit rpm
