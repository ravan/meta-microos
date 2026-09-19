SUMMARY = "Himmelblau SELinux config"
DESCRIPTION = "Himmelblau is an interoperability suite for Microsoft Azure Entra Id \
and Intune, which allows users to sign into a Linux machine using Azure \
Entra Id credentials."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.14+git0.7d1ea961"

RPM_NAME = "himmelblau-selinux-3.1.14+git0.7d1ea961-1.1.aarch64.rpm"
RPM_HASH = "f4d7daf78b35547430e87c8a1317a995af58c98ebea0bcf2fbd0d595551308a6433249e26013fd4c784f7b76cc4270cc8515c38b51cc085a54adcb250fe4f772"

RPROVIDES:${PN} += "himmelblau-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
himmelblau \
libselinux-utils \
policycoreutils \
selinux-policy \
selinux-policy-base"

inherit rpm
