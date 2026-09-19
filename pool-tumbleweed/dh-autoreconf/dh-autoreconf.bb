SUMMARY = "Add-on for debhelper to call autoreconf and clean up after the build"
DESCRIPTION = "dh-autoreconf provides a debhelper sequence addon named 'autoreconf' and \
two commands, dh_autoreconf and dh_autoreconf_clean. \
 \
The dh_autoreconf command creates a list of the files and their checksums, \
calls autoreconf and then creates a second list for the new files. \
 \
The dh_autoreconf_clean command compares these two lists and removes all \
files which have been added or changed (files may be excluded if needed). \
 \
For CDBS users, a rule is provided to call the dh-autoreconf programs at \
the right time."
LICENSE = "GPL-2.0-or-later"

PV = "19"

RPM_NAME = "dh-autoreconf-19-3.26.noarch.rpm"
RPM_HASH = "b85d29a48f22784f3f71c1586e7cc9ca22e9d9a8f6298c0893acd0db3928e0d039850c27cca361d57014b1a11e3c388b4063b76ddb30c4606f78f3adad301b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb-/usr/bin/dh-autoreconf \
dh-autoreconf"

RDEPENDS:${PN} += "/usr/bin/perl \
debhelper \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
