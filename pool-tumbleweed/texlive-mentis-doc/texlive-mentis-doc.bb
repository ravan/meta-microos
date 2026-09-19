SUMMARY = "Documentation for texlive-mentis"
DESCRIPTION = "This package includes the documentation for texlive-mentis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-mentis-doc-2026.226.1.5svn15878-59.2.noarch.rpm"
RPM_HASH = "1eddf4467f8fc29aead560012a58c25fda11aef30a73af99486100eecd920735e2cdd57d35d51acbf73571d8600c0feefc2ac2f72331ff3a0b88015e3a3ec5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mentis-doc"

RDEPENDS:${PN} += ""

inherit rpm
