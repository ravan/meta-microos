SUMMARY = "Graphical Git Repository Viewer"
DESCRIPTION = "QGit is a git GUI viewer built on Qt/C++. \
 \
With qgit you will be able to browse revisions history, view patch \
content and changed files, graphically following different development \
branches. \
 \
Features \
 \
- View revisions, diffs, files history, files annotation, archive tree. \
 \
- Commit changes visually cherry picking modified files. \
 \
- Apply or format patch series from selected commits, drag and drop \
commits between two instances of qgit. \
 \
- Associate commands sequences, scripts and anything else executable to \
a custom action. Actions can be run from menu and corresponding output \
is grabbed by a terminal window. \
 \
- qgit implements a GUI for the most common StGIT commands like push/pop \
and apply/format patches. You can also create new patches or refresh \
current top one using the same semantics of git commit,  i.e. cherry \
picking single modified files."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "qgit-2.13-1.4.aarch64.rpm"
RPM_HASH = "7cc2a006090e5147387fa772a9fff35fc3e00047564f082fc35c31bf0a9d62b9fd45bb101f238bef09852345633e58fbb0a99bf81d14d8ae6f203c1cb4472896"

RPROVIDES:${PN} += "qgit"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
