SUMMARY = "SELinux support for cepces"
DESCRIPTION = "SELinux support for cepces"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.16"

RPM_NAME = "cepces-selinux-0.3.16-1.4.noarch.rpm"
RPM_HASH = "7b95c669bb2d4860600309ab6f57f7db29e9eca581995a028138873c789cf8924cba21fc7b5e24232e933cbf81e50a09d622b5be4fb314d5beb73e3c629eedf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy \
selinux-policy-targeted"

inherit rpm
