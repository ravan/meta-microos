SUMMARY = "SELinux module for qsnapper"
DESCRIPTION = "This package provides the SELinux policy module to ensure qsnapper \
runs properly under an environment with SELinux enabled."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.3"

RPM_NAME = "qsnapper-selinux-1.3.3-1.4.noarch.rpm"
RPM_HASH = "f67c96e52b7fcc4d6fbedde528b8ed84fdd49d6de135c0b324d4bcc0ad5f3abf79ee0974a53d4eb657b6bae0f66d54b1ddd8458cf00d17c90851b7bf896fbabf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qsnapper-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
policycoreutils \
qsnapper"

inherit rpm
