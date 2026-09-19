SUMMARY = "Zsh Completion for river"
DESCRIPTION = "Zsh command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-zsh-completion-0.3.12-2.6.noarch.rpm"
RPM_HASH = "418e56da99825d9f6c8958af62ea4525152ced4b5afb5c0303b5a5398642db18e160a13d611c228a9ebe4b798dd2fda93a74582db49f71b28e749bbf94296e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-zsh-completion"

RDEPENDS:${PN} += "river \
zsh"

inherit rpm
