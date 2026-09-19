SUMMARY = "Documentation for texlive-epsf-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-epsf-dvipdfmx"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-doc-2026.226.2014svn35575-61.4.noarch.rpm"
RPM_HASH = "b16687b941d55bc41026f52e4167a314e24e9c90483af83407a638f1daa4ce032f3f803c87182ac1223f0b331d5822687c358089b6466dc9ce90aebd0b258ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-dvipdfmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
