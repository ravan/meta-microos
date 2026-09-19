SUMMARY = "Documentation for texlive-featpost"
DESCRIPTION = "This package includes the documentation for texlive-featpost"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.8.8svn35346"

RPM_NAME = "texlive-featpost-doc-2026.226.0.0.8.8svn35346-59.2.noarch.rpm"
RPM_HASH = "f24a4867f4b13579e9765fbe78e6988ddd459220d71d48adffa56a9e5ef689a07d31763a0b7c4f03b5c2efd43a85639dd4260a2935413acd86b929a9718bfdf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-featpost-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
