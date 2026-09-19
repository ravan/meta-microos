SUMMARY = "Color themes for emacs"
DESCRIPTION = "Emacs Color Themes is an add-on package for GNU Emacs. \
It provides several different color themes to skin your Emacs greatly \
improving the editing experience."
LICENSE = "GPL-2.0+"

PV = "6.6.0"

RPM_NAME = "emacs-color-theme-6.6.0-1.24.noarch.rpm"
RPM_HASH = "5d3d3b88b27daa9343a9704f9a6a0c8e2d2279ed827d40b2b52404ca720d74761d55b5200b43369e6eb1a9861e67aba84dd6d58cd6bfd521d33f367c3bfd0f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-color-theme"

RDEPENDS:${PN} += "emacs"

inherit rpm
