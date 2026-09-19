SUMMARY = "Spam filtering system - AppArmor profile"
DESCRIPTION = "This package contains an AppArmor profile for Rspamd."
LICENSE = "Apache-2.0"

PV = "4.1.5"

RPM_NAME = "rspamd-apparmor-4.1.5-1.1.noarch.rpm"
RPM_HASH = "83003034a5ca96a05d1196f2c901eb8ce90e4f60b324f3927c30d72d25a99bb9c3ff6996bc277a0b576bc1f23622c01639d051556e24c9b3122eb658db38f985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rspamd-apparmor \
rspamd-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions \
rspamd"

inherit rpm
