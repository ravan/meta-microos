SUMMARY = "Git revision tree visualiser"
DESCRIPTION = "Grapical tool for visualization of revision trees of projects \
maintained in the Git version control system. It name gitk indicates \
that it's written using the Tk Widget set. \
 \
A simple Tk based graphical interface for common Git operations is \
found in the package git-gui."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "gitk-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "1c2559aac053509717fc8a184c517c8a2553dc40cddaf207084ac62325a277300bbda10907640d9b3362f8f1cbabbdd983e906782f3196ee5b3ea859f479b364"

RPROVIDES:${PN} += "gitk"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm
