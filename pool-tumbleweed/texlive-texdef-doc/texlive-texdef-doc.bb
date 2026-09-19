SUMMARY = "Documentation for texlive-texdef"
DESCRIPTION = "This package includes the documentation for texlive-texdef"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.10svn74067"

RPM_NAME = "texlive-texdef-doc-2026.227.1.10svn74067-62.2.noarch.rpm"
RPM_HASH = "421379ce36f27c91ffc3743559e0fac010df4390510f2ad5dc278b7dc90466b2cfc279c6eea4d9553b036f0bb76396ab4b7eb065eec141db74cdb592d775bbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
