SUMMARY = "Command line filters for processing subunit streams"
DESCRIPTION = "Command line filters for processing subunit streams."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "subunit-filters-1.4.6-1.2.noarch.rpm"
RPM_HASH = "803fe6135d47c0fd0e5f33dfb4cd7fe2e420191eb9ff2e7fa0ec7870de8b0927216bd35a18540f2bdd8790291d16063bb506ed9db75ef5755c9152f7da0cfc4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subunit-filters"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-junitxml \
python3-python-subunit \
typelib-1-0-Gtk-3-0"

inherit rpm
