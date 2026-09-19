SUMMARY = "Documentation for texlive-rcsinfo"
DESCRIPTION = "This package includes the documentation for texlive-rcsinfo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-doc-2026.226.1.11svn15878-60.4.noarch.rpm"
RPM_HASH = "fd8e7dadd197c851fb81f773e0b69aaeb4d02e9c137a394c89d5f4ca0b37edd0deb35d98f51979fe143b99f42edc4a6f653483f98198e8da427e12060df8e9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcsinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
