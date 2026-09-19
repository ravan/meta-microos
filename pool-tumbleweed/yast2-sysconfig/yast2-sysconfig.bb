SUMMARY = "YaST2 - Sysconfig Editor"
DESCRIPTION = "A graphical /etc/sysconfig/* editor with integrated search and context \
information."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "yast2-sysconfig-5.0.0-1.15.noarch.rpm"
RPM_HASH = "39459d8230d616677ee1f56d08b3994ff8d3ff85decd500bc0ba518e3215e96d9ae094f3073973d9dce99c059ae2c7ef28cd57b0a217994474109a7ab5a6f8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-sysconfig"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
yast2 \
yast2-ruby-bindings"

inherit rpm
