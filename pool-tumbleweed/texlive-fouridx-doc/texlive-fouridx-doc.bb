SUMMARY = "Documentation for texlive-fouridx"
DESCRIPTION = "This package includes the documentation for texlive-fouridx"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77682"

RPM_NAME = "texlive-fouridx-doc-2026.226.2.00svn77682-60.2.noarch.rpm"
RPM_HASH = "e11cac47bd2da39b681689a57c6de7d80d2c5a15d07ca19b782326bbda4f3fe8991a66d7e6b3728a02f0083d56956884c6a40009833f1cd03ba72548a654862d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fouridx-doc"

RDEPENDS:${PN} += ""

inherit rpm
