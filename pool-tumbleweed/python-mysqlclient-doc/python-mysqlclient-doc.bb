SUMMARY = "HTML documentation for python-mysqlclient"
DESCRIPTION = "This package contains HTML docs for python-mysqlclient."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.8"

RPM_NAME = "python-mysqlclient-doc-2.2.8-1.5.noarch.rpm"
RPM_HASH = "b6bd83b7c913ac7d49c3fb1d14bba48b7ea9ec5c28c26930f150cd429ecf6ab4e952ed593e530ce8a80adab6fcebf7e92266c90ba227b9e2b0e8e121073dff87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mysqlclient-doc"

RDEPENDS:${PN} += "python3-mysqlclient"

inherit rpm
