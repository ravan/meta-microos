SUMMARY = "Documentation for texlive-coolstr"
DESCRIPTION = "This package includes the documentation for texlive-coolstr"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.2.2svn67015"

RPM_NAME = "texlive-coolstr-doc-2026.226.2.2svn67015-61.2.noarch.rpm"
RPM_HASH = "80ba6a996b49f17cc28abcfcf07baab9361bc12b2e3bddf6c02032e1c7a653f6e62a9334eb279ebfc32b0e6a7a2294aefa67162613b86786b31ebcfd2ed8347f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolstr-doc"

RDEPENDS:${PN} += ""

inherit rpm
