SUMMARY = "Bash Completion for tlp-rdw"
DESCRIPTION = "The official bash completion script for tlp-rdw."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-rdw-bash-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "65f55dc993121aeab2e8369be321f6a23346a2e148fd157e76d64aa230c1e115f522019fa58f823a1f10f0571881969edd4981ba518189a00f814b937904aa9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-rdw-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tlp-rdw"

inherit rpm
