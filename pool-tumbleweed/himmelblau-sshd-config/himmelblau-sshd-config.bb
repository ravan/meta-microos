SUMMARY = "Azure Entra Id SSHD Configuration"
DESCRIPTION = "Himmelblau is an interoperability suite for Microsoft Azure Entra Id \
and Intune, which allows users to sign into a Linux machine using Azure \
Entra Id credentials."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.14+git0.7d1ea961"

RPM_NAME = "himmelblau-sshd-config-3.1.14+git0.7d1ea961-1.1.noarch.rpm"
RPM_HASH = "1d0dfae6ae2cda2f4a056bed2483e87073fe03620943311a7d5d1c422dd1f763c0edb643dd79bff6a8a129dbf3b79fcbc7821764ac3c77d6679e961f2120d089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-himmelblau-sshd-config \
himmelblau-sshd-config"

RDEPENDS:${PN} += "himmelblau \
openssh-server"

inherit rpm
