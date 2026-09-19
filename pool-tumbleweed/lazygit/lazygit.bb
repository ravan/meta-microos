SUMMARY = "Simple terminal UI for git commands"
DESCRIPTION = "lazygit is a terminal UI for git commmands that helps make common and complex \
git operations easy and accessible without requiring expertise with the git \
command line."
LICENSE = "MIT"

PV = "0.63.0"

RPM_NAME = "lazygit-0.63.0-1.2.aarch64.rpm"
RPM_HASH = "be5ab028a4661b49b85b915ad95c4b57bfcaf7761d697a4ebfb844777060efcdc5159751f135c09b7ad97cb9f5edb8350fc60b864fd73b1557a759fd2ed30127"

RPROVIDES:${PN} += "lazygit"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
