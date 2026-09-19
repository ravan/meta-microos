SUMMARY = "Documentation for texlive-examplep"
DESCRIPTION = "This package includes the documentation for texlive-examplep"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.04svn55265"

RPM_NAME = "texlive-examplep-doc-2026.226.0.0.04svn55265-59.2.noarch.rpm"
RPM_HASH = "1565a519850740da6c86f90bfb8714e0e8c585dde4c0a16fbc913b18889862b16b92f03df47d1c847b9155ce38038fd7ec2d01145c1267e677abbcd8302ead83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-examplep-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
