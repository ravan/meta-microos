SUMMARY = "OneDrive Bash completion"
DESCRIPTION = "OneDrive shell completions for Bash."
LICENSE = "GPL-3.0-only"

PV = "2.5.11"

RPM_NAME = "onedrive-completion-bash-2.5.11-1.4.noarch.rpm"
RPM_HASH = "aae464ce8db0a70c66b64a983982712354ed3e310f02dd23ac53e46aa0c8dc52dd2a5181f9dba0c4bd3896e2a280e1aff1d420ab9f8a68a74cc5cd5d7bdac954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onedrive-completion-bash"

RDEPENDS:${PN} += "bash \
bash-completion \
onedrive"

inherit rpm
