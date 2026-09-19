SUMMARY = "Documentation for texlive-haranoaji-extra"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji-extra"
LICENSE = "OFL-1.1"

PV = "2026.226.20250811svn76079"

RPM_NAME = "texlive-haranoaji-extra-doc-2026.226.20250811svn76079-60.4.noarch.rpm"
RPM_HASH = "76502f05dff81f5faee7653334642252cea0987cd66342e0909ca59dd2b6ba7c6c7a6eee70db16aa1f0d1a6c5ca79b454fd1d7ec7a051623a9d614c16bee12f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
