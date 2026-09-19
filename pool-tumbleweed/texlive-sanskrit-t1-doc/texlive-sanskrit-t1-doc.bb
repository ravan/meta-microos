SUMMARY = "Documentation for texlive-sanskrit-t1"
DESCRIPTION = "This package includes the documentation for texlive-sanskrit-t1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55475"

RPM_NAME = "texlive-sanskrit-t1-doc-2026.226.svn55475-60.2.noarch.rpm"
RPM_HASH = "b1b955afd6fcbce62bc956d1d7f1769df89dba17fd6bd500b774460d1676e6a9dd65caaf5661a6b03c2f6a3b06fae5a1ca5a6ae86df4d33cee385589340216f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanskrit-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
