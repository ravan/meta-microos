SUMMARY = "Keylime verifier service"
DESCRIPTION = "Subpackage of keylime for verifier service."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "keylime-verifier-7.14.3-1.1.noarch.rpm"
RPM_HASH = "deaed790bf602b5ba1c346d445d2f7d6f385c5d58c690523c4ab5dd40cb8aecb4d5562650f380dcbde686dc77b620269739ad5441a68cf3986367c44fbd4f0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-verifier"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tss \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime \
user-keylime"

inherit rpm
