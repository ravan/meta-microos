SUMMARY = "A tool to build desktop menu for LXDE"
DESCRIPTION = "LXSession is the default X11 session manager of LXDE. \
(LXDE: Lightweight X11 Desktop Environment) \
http://lxde.sourceforge.net/ \
 \
This package provides files required to build freedesktop.org \
menu spec-compliant desktop menus for LXDE."
LICENSE = "GPL-2.0"

PV = "0.1.5"

RPM_NAME = "lxmenu-data-0.1.5-3.1.noarch.rpm"
RPM_HASH = "632fd39fe8421569a7915a6c703a9c471dc7639cb4e9f90aaf401e10b87444806b072a300633840b67bb1ff3fdee96d52d4f3937e0446c1ab38a1cf570f9c00b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxmenu-data \
lxmenu-data"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils"

inherit rpm
