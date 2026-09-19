SUMMARY = "Documentation for texlive-placeat"
DESCRIPTION = "This package includes the documentation for texlive-placeat"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1d1svn45145"

RPM_NAME = "texlive-placeat-doc-2026.226.0.0.1d1svn45145-58.2.noarch.rpm"
RPM_HASH = "22424616860fc897790d6cae2c754c2577b2202212cdc8fd5de6d7ad454e082095feaa2c8106467eddf4c77418f43156c9c28159ebeebdde2022b17459292d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-placeat-doc"

RDEPENDS:${PN} += ""

inherit rpm
