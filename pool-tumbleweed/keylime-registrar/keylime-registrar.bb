SUMMARY = "Keylime registrar service"
DESCRIPTION = "Subpackage of keylime for registrar service."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "keylime-registrar-7.14.3-1.1.noarch.rpm"
RPM_HASH = "ef11e7622de95cd6ff5b7386d210440b7a23674aedefed2d8317ab2f1e931a66b4709482863e4a7f744ef006662347241f01a26f654e3ace8ce15045f3467e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-registrar"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tss \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime \
user-keylime"

inherit rpm
