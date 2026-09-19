SUMMARY = "Documentation for texlive-menucard"
DESCRIPTION = "This package includes the documentation for texlive-menucard"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn55643"

RPM_NAME = "texlive-menucard-doc-2026.226.0.0.1svn55643-61.2.noarch.rpm"
RPM_HASH = "7d84b92713795f399de920e7019a07faa85daaac964fb99d27fd2290f51fe5521d89a5a308603f8431d8257ccc3a35f124501588a7b905fe842d199e91bc181a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menucard-doc"

RDEPENDS:${PN} += ""

inherit rpm
