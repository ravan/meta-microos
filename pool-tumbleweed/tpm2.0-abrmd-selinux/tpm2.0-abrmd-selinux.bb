SUMMARY = "SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-selinux-3.0.0-8.8.noarch.rpm"
RPM_HASH = "16637852333c45ecdd3af164feecb9257996ec95ea5b818a29b68164fbeb076f140833c7d0c6dae534b616f8ed729223b014adace8da7598e793b8201cc5625d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tpm2.0-abrmd-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base \
tpm2.0-abrmd"

inherit rpm
