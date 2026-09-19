SUMMARY = "Systemd unit files for python-django-eremaea2"
DESCRIPTION = "This package contains the systemd unit files for python-django-eremaea2."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "eremaea-2.1.1-1.4.noarch.rpm"
RPM_HASH = "e378e85665b3c62d21dbe21a2cc02874599016ceb808eb75bb02f1caa1a664fa3a9259183fd12115fa99740564ae116d246cdaeb9765b2382148c99cf4c7ccca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eremaea"

RDEPENDS:${PN} += "/usr/bin/eremaeactl \
/usr/bin/sh"

inherit rpm
