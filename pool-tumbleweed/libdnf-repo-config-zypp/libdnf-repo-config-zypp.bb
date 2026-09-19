SUMMARY = "Enables Zypper repository configuration for DNF"
DESCRIPTION = "This package allows libdnf and all consumers to be able to reuse \
repository configuration files set for Zypper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.75.0"

RPM_NAME = "libdnf-repo-config-zypp-0.75.0-1.3.noarch.rpm"
RPM_HASH = "9ee9d69c403c3f945062a71a3a07f4f0979e2c49c640ffaa8659aa69227127343959ec15cb6ded0af3fa2584b44752ba1bace74ff7c8c20eaf05b83d403f8dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdnf-repo-config-zypp \
rpm-repos-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
