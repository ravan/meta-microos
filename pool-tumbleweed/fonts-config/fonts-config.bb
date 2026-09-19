SUMMARY = "Script to configure fonts for X Windows and other applications"
DESCRIPTION = "A script to configure fonts for X Windows and other applications. \
 \
fonts-config is usually called automatically when a package containing \
fonts is installed, upgraded or removed. But it can also be executed \
directly, which is mainly useful to debug it (use the --debug flag)."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "20231210+git0.f7216ba"

RPM_NAME = "fonts-config-20231210+git0.f7216ba-1.10.noarch.rpm"
RPM_HASH = "72a39ffb5e6f3bc4e385131432ecf6402727766a270cd0cbb3af24419078de97b56fd2cf76958c68dc0c7a23a607967f7985d9c8b8599013ab3008034b603b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fonts-config \
fonts-config"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
aaa-base \
coreutils \
fillup \
fontconfig \
gawk \
perl \
perl-English"

inherit rpm
