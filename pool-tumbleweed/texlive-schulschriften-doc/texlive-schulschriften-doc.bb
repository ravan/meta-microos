SUMMARY = "Documentation for texlive-schulschriften"
DESCRIPTION = "This package includes the documentation for texlive-schulschriften"
LICENSE = "LPPL-1.0"

PV = "2026.226.5svn59388"

RPM_NAME = "texlive-schulschriften-doc-2026.226.5svn59388-60.2.noarch.rpm"
RPM_HASH = "0956ded8c5eaefa3b02c405205f15701b0d15fd6ccb52737828f9eaecccad2c8d1db5cb020345f4dfcc8bae6c4f25506024dfb97166b74aedebb41f49f575652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schulschriften-doc"

RDEPENDS:${PN} += ""

inherit rpm
