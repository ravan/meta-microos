SUMMARY = "Grapical tool for common git operations"
DESCRIPTION = "A Tcl/Tk based graphical user interface to Git. git-gui focuses on \
allowing users to make changes to their repository by making new \
commits, amending existing ones, creating branches, performing local \
merges, and fetching/pushing to remote repositories. \
 \
Unlike gitk, git-gui focuses on commit generation and single file \
annotation, and does not show project history. It does however supply \
menu actions to start a gitk session from within git-gui."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-gui-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "1cc8d595ffcbbfa0257a98692ec01f8c375ef27c2cb9f34d3fbf2d2e0d63823474054cd3d324cc6d89525ca3ea9f4cd9ae1bc9d16898725050ad6e0dd15ecf67"

RPROVIDES:${PN} += "git-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm
