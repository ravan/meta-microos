SUMMARY = "Documentation for texlive-nameauth"
DESCRIPTION = "This package includes the documentation for texlive-nameauth"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2svn76172"

RPM_NAME = "texlive-nameauth-doc-2026.226.4.2svn76172-61.2.noarch.rpm"
RPM_HASH = "7e809e82b743af3ed7caebf77af247687a692fb7751874f0429ef67acf34a30d591f87c15d279d54bc522de6b63d961247197c0c5be0a5eee56c48533f74d4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nameauth-doc"

RDEPENDS:${PN} += ""

inherit rpm
