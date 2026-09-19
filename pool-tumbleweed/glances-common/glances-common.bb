SUMMARY = "Service and firewalld files for glances"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface. \
 \
This packages contains the service file to start a glances server \
from systemd and a firewalld file to open the default port."
LICENSE = "LGPL-3.0-only"

PV = "4.5.6"

RPM_NAME = "glances-common-4.5.6-1.1.noarch.rpm"
RPM_HASH = "6942bd6a3fd245086c9c56d86a453df9e905b26b8b1723025e0846b8fa36e4fa010762b190427593c425d0bad2da6dd6f1f0effa6405434fe45037048b467043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances-common"

RDEPENDS:${PN} += "/usr/bin/sh \
glances"

inherit rpm
