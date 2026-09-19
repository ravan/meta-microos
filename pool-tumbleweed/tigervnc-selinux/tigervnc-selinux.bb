SUMMARY = "SELinux module for TigerVNC"
DESCRIPTION = "This package provides the SELinux policy module to ensure TigerVNC \
runs properly under an environment with SELinux enabled."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "tigervnc-selinux-1.16.1-3.1.noarch.rpm"
RPM_HASH = "97b9a8c98b1c3cbaf18544fa1fa95457fcb7ef573ef1a9e923ae6a89d324c9e4e77cff44ba171704615daa068c5bde6bfceeec8a12d2738d07215cfb11f0559d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tigervnc-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base"

inherit rpm
