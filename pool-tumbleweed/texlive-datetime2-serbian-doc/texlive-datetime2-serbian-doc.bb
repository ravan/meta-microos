SUMMARY = "Documentation for texlive-datetime2-serbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-serbian"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn67201"

RPM_NAME = "texlive-datetime2-serbian-doc-2026.226.2.1.0svn67201-59.2.noarch.rpm"
RPM_HASH = "52725fbccd79d6fd1b4fc242f9560a9f171affc1450564cc529bd0b0361c1e5c91bccb48dd7b17e9dbfd025294cb4c0376df5f8c58638157760cb864972372ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
