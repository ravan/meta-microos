SUMMARY = "Documentation for texlive-epsincl"
DESCRIPTION = "This package includes the documentation for texlive-epsincl"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-doc-2026.226.0.0.2svn29349-61.4.noarch.rpm"
RPM_HASH = "1c0c8c9f7ebc9e0e363d0ce914b068c74841b5ade2c22eca051edf045d7e06044b6b3d6a64be3b9fe19740d8b4bf7c86a5210d75db95f00238ee10797a261ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
