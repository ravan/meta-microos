SUMMARY = "Kernel rpm scriptlets"
DESCRIPTION = "Scripts called by the SUSE kernel packages on installation"
LICENSE = "GPL-2.0-or-later"

PV = "16.1.7"

RPM_NAME = "suse-module-tools-scriptlets-16.1.7-1.1.aarch64.rpm"
RPM_HASH = "a8bae10e886d21e5f3b89e968583dabe3f0cfbaeb18bf66bcf58073742b6fca5a6766f54795fc27bcd985e1f66b984fca4f7b6205c68f3c6f29e15b270024366"

RPROVIDES:${PN} += "sdbootutil-rpm-scriptlets \
suse-kernel-rpm-scriptlets \
suse-module-tools-/usr/lib/module-init-tools/kernel-scriptlets \
suse-module-tools-scriptlets"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
suse-module-tools"

inherit rpm
