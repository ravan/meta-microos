SUMMARY = "SELinux module for adcli"
DESCRIPTION = "This package provides the SELinux policy module to ensure adcli \
runs properly under an environment with SELinux enabled."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3.1"

RPM_NAME = "adcli-selinux-0.9.3.1-2.7.noarch.rpm"
RPM_HASH = "65ed4d30443711f32e02deb0e75b3c3165eec2bfc242c48f2e261c1f873946f0e04ba4cddbcc53bfd4df0d98cc56a6a823352088110fbda1289c97d74efbb5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adcli-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base \
selinux-policy-targeted"

inherit rpm
