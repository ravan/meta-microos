SUMMARY = "YaST2 - NFS Server Configuration"
DESCRIPTION = "The YaST2 component for configuration of an NFS server. NFS stands for \
network file system access. It allows access to files on remote \
machines."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "yast2-nfs-server-5.0.2-1.2.noarch.rpm"
RPM_HASH = "33b7b5ecfa7f1ca8686d5a028104bca4b72e24287aa68254fa94ff4a55439e2017dbbc928466824e3469fc7fff325467f353880823515f815436566836bac1b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-nfs-server"

RDEPENDS:${PN} += "/usr/bin/perl \
yast2 \
yast2-nfs-common \
yast2-ruby-bindings"

inherit rpm
