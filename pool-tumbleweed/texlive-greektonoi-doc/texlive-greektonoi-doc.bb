SUMMARY = "Documentation for texlive-greektonoi"
DESCRIPTION = "This package includes the documentation for texlive-greektonoi"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.svn39419"

RPM_NAME = "texlive-greektonoi-doc-2026.226.svn39419-60.4.noarch.rpm"
RPM_HASH = "16a897cb3a3899089e0d08da17680f3226a9aa441c913c4f98f787cf91d1dcf43afea126031be059d96ef578a28bbe9aa6e6b8e127aa2201425d9b0fe35891cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektonoi-doc-el \
texlive-greektonoi-doc"

RDEPENDS:${PN} += ""

inherit rpm
