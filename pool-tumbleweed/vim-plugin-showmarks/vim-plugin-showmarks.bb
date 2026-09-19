SUMMARY = "Visually shows the location of marks"
DESCRIPTION = "ShowMarks provides a visual representation of the location marks.  Marks are \
useful for jumping back and forth between interesting points in a buffer, but \
can be hard to keep track of without any way to see where you have placed them. \
ShowMarks hopefully makes life easier by placing a sign in the leftmost column \
of the buffer.  The sign indicates the label of the mark and its location.  It \
can be toggled on and off and individual marks can be hidden."
LICENSE = "SUSE-Public-Domain"

PV = "2.3"

RPM_NAME = "vim-plugin-showmarks-2.3-64.2.noarch.rpm"
RPM_HASH = "5d40442de2a5f46f0746151f30d01301cedcd0f711c6250cc6647a461f69c25f508579e8d5a3f3308e2f98ea4e8c44ac88d87cd253a1a229c8b7f1bcb7e83206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-showmarks"

RDEPENDS:${PN} += "vim"

inherit rpm
