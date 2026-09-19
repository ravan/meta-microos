SUMMARY = "SELinux support for passt and pasta"
DESCRIPTION = "This package adds SELinux enforcement to passt(1), pasta(1) and pesto(1)."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "20260612.a9c61ff"

RPM_NAME = "passt-selinux-20260612.a9c61ff-1.3.noarch.rpm"
RPM_HASH = "ea3cfe685cae7ae1c8ff8b53a8d2a3c6894060506b9f443d4a9b572be26b372979ca336d09565268a009a3830fd4ebdf2a39940ba8671b6340ab8d6ef19219b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "passt-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
container-selinux \
libselinux-utils \
passt \
policycoreutils \
selinux-policy \
selinux-policy-base"

inherit rpm
