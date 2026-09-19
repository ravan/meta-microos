SUMMARY = "Documentation for texlive-mceinleger"
DESCRIPTION = "This package includes the documentation for texlive-mceinleger"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-mceinleger-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "7c8822366c822476101f93daf50e8a9fa9ee41a59c6ec054210214cedffc4259891bf8be522fe08c59eaedb9b645157460f6e351215796a4f65d2ead50fce944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mceinleger-doc"

RDEPENDS:${PN} += ""

inherit rpm
