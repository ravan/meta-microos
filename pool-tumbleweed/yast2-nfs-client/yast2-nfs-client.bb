SUMMARY = "YaST2 - NFS Configuration"
DESCRIPTION = "The YaST2 component for configuration of NFS. NFS stands for network \
file system access. It allows access to files on remote machines."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "yast2-nfs-client-5.0.2-1.2.noarch.rpm"
RPM_HASH = "9a667583dcfe5b9739a5ff2223cce8427d1163cfe8dfabdffd7a773b480293ad71e0d675d590a716d492d48da5f2e46c12a70d82da8227956becdfc32a68e192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-config-network-/usr/lib/YaST2/clients/lan-nfs-client.ycp \
yast2-config-nfs \
yast2-config-nfs-devel \
yast2-nfs-client \
yast2-trans-nfs"

RDEPENDS:${PN} += "/usr/bin/killall \
yast2 \
yast2-nfs-common \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
