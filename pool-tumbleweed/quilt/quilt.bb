SUMMARY = "A Tool for Working with Many Patches"
DESCRIPTION = "Quilt allows you to easily manage large numbers of patches by keeping \
track of the changes each patch makes. Patches can be applied, \
un-applied, refreshed, and more."
LICENSE = "GPL-2.0-or-later"

PV = "0.69"

RPM_NAME = "quilt-0.69-1.4.noarch.rpm"
RPM_HASH = "9dff2f2134be694974e992f6b81604bd7cb314ca4fdb3ebf8657f69e09c470e84368b47b470a6d47a1eb1c6edca14561c97b908e68ae6add0c446a739f2f3f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-quilt \
quilt"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
coreutils \
diffstat \
diffutils \
file \
findutils \
gzip \
less \
mktemp \
patch \
perl"

inherit rpm
