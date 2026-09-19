SUMMARY = "Documentation for texlive-bizcard"
DESCRIPTION = "This package includes the documentation for texlive-bizcard"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-bizcard-doc-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "f58bb74159a0ed4311402c6f5f01ffcacdd04a46996711176f6ccf3304d1b01057ab4f743b90f7970f8ad9762281ef06ad85f871072c3c5637315768e6df5e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bizcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
