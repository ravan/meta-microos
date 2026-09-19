SUMMARY = "A disk-to-disk backup tool for Linux"
DESCRIPTION = "storeBackup is a disk-to-disk backup tool. The backuped files can be \
directly browsed (locally, via NFS, via SAMBA or whatever). This \
gives the users the possibility to restore files. They only have to \
copy (and possibly uncompress) the file. The is also a tool for \
restoring (sub) trees for the administrator. Every single backup of a \
specific time can be deleted without affecting the other existing \
backups. \
 \
Before you can start using storeBackup, please carefully read \
        /usr/share/doc/packages/storeBackup/README.1ST \
and create an appropriate configuration file \
        /etc/storebackup.d/storebackup.config \
using \
        /usr/share/doc/packages/storeBackup/storebackup.config.default \
as a template."
LICENSE = "GPL-3.0-or-later"

PV = "3.5.2"

RPM_NAME = "storeBackup-3.5.2-1.8.noarch.rpm"
RPM_HASH = "5ad5679b62e320bd333906c57b5fca91bed0e92542a5e9df536a126f91f2147dbd99173bc1dfb9fd12c3d2b1c0f6fe407019cfb6878eb0aa09dc62cae803a05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "storeBackup"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
bzip2 \
e2fsprogs \
fileutils \
sh-utils \
textutils \
which"

inherit rpm
