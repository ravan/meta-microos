SUMMARY = "Systemd presets for Transactional Server System Role"
DESCRIPTION = "Service presets for systemd for Transactional Server System Role."
LICENSE = "MIT"

PV = "15.0"

RPM_NAME = "systemd-presets-branding-transactional-server-15.0-6.3.noarch.rpm"
RPM_HASH = "cbfe0436e3149765d3ce2fcb62ee6faf0ebde89d386fa4655b37b1f813982c58335045feab50e17a66523f172dcc4b8759b4ff17fe90f5b2cc2011cfdbfab023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding-transactional-server"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
