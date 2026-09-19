SUMMARY = "Tool that converts source archives into Debian package source"
DESCRIPTION = "This package allows you to take a standard (or upstream) source package \
and convert it into a format that will allow you to build Debian packages. \
 \
After answering a few questions, dh_make will then provide a set of \
templates that, after some small editing, will allow you to create a \
Debian package."
LICENSE = "SUSE-GPL-3.0-with-template-exception"

PV = "1.20140617"

RPM_NAME = "dh-make-1.20140617-1.25.noarch.rpm"
RPM_HASH = "3a0fe930f5f779f6c3faa57a5174083f2587365e9766349b2caee54a5f29ebecf2ea49f6c686f3a0687b619a80c24f3e2f100c362aeb441d6c7a240689be345c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb-/usr/bin/dh-make \
dh-make"

RDEPENDS:${PN} += "/usr/bin/make \
/usr/bin/perl \
/usr/bin/sh \
debhelper \
dpkg \
perl"

inherit rpm
