SUMMARY = "Easy Git worktree management for the terminal"
DESCRIPTION = "LazyWorktree is a TUI for Git worktrees. It provides a keyboard-driven workflow \
for creating, inspecting, and navigating worktrees within a repository. \
 \
Built with BubbleTea, it focuses on fast iteration, clear state visibility, and \
tight Git tooling integration."
LICENSE = "Apache-2.0"

PV = "1.49.0"

RPM_NAME = "lazyworktree-1.49.0-1.2.aarch64.rpm"
RPM_HASH = "16e6418bbbe0708220816ce2a89d0143c640576daee8f8714d431723869a00447726eb2c0350a886f536e03542bd53c7e564a28d3ec794170cb487f62eac233c"

RPROVIDES:${PN} += "lazyworktree"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
