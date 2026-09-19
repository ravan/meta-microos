SUMMARY = "Fast, disk based, rotating network backup system"
DESCRIPTION = "Dirvish is a fast, disk based, rotating network backup system. With dirvish you \
can maintain a set of complete images of your filesystems with unattended \
creation and expiration. A dirvish backup vault is like a time machine for your \
data."
LICENSE = "OSL-2.0"

PV = "1.2.1"

RPM_NAME = "dirvish-1.2.1-3.7.noarch.rpm"
RPM_HASH = "d9af092079d1920b04406749c07314fcdfe98e24dd8077be38577ea70403797214d4c560c8e9a4af5f6227bb20a9d5402c5d9bd1ab41f434f79d7940573c885f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dirvish \
dirvish"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Time--ParseDate \
perl-Time--Period \
rsync"

inherit rpm
