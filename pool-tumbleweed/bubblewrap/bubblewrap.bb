SUMMARY = "Core execution tool for unprivileged containers"
DESCRIPTION = "Bubblewrap (/usr/bin/bwrap) is a core execution engine for unprivileged \
containers that works as a setuid binary on kernels without \
user namespaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "bubblewrap-0.12.0-1.1.aarch64.rpm"
RPM_HASH = "1506d20758b658c5a0ade7e47f29cbf091fc28e549bdd830fafc3469ee775e340db6bbdc5e38872e9cda8975ae53ef20ad5ad443a01502d9cd13f50baba8b941"

RPROVIDES:${PN} += "bubblewrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libselinux.so.1"

inherit rpm
