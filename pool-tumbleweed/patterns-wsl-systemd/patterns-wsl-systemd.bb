SUMMARY = "WSL systemd setup"
DESCRIPTION = "This package contains the wsl_systemd pattern: adjusts or provides /etc/wsl.conf and /sbin/init symlink where required."
LICENSE = "MIT"

PV = "20240327"

RPM_NAME = "patterns-wsl-systemd-20240327-1.7.noarch.rpm"
RPM_HASH = "2b7093a06f3eb5c902e24c1fc7ef1055062a90825abcd906dfecdaf072f778e7ea5987bf3ab64ae78b27e7a68728bc53ff24b30c04ccb09132b19667dc16b58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-visible- \
patterns-wsl-systemd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
patterns-wsl-tmpfiles \
systemd"

inherit rpm
