SUMMARY = "Patch and package update notification via mail"
DESCRIPTION = "patch2mail checks for available updates and sends a mail to root \
if any patches or updated packages (configureable) are available."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "patch2mail-1.1.2-5.10.noarch.rpm"
RPM_HASH = "ec2850d57d80f22bec256209071faf47c8e00b0414904b44a25cc85ec031af890f511258cb2a60d61ad2024cc6075a0217e9a5406eca5c8e3f5a672c2ab1b512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patch2mail"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/hostname \
/usr/bin/rm \
/usr/bin/sh \
/usr/bin/xsltproc \
grep \
mail \
mktemp \
zypper"

inherit rpm
