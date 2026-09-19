SUMMARY = "Documentation for texlive-xepersian"
DESCRIPTION = "This package includes the documentation for texlive-xepersian"
LICENSE = "LPPL-1.0"

PV = "2026.226.26.01.01svn77682"

RPM_NAME = "texlive-xepersian-doc-2026.226.26.01.01svn77682-59.4.noarch.rpm"
RPM_HASH = "a995004c20fb3ac4d33c96769d28490e7a8afe587effcc5c3ff0d0038552710fd91f008e66af6393131316c2c72022652deb722fa299f0ba9668021bfa485311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xepersian-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
