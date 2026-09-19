SUMMARY = "Documentation for texlive-mpattern"
DESCRIPTION = "This package includes the documentation for texlive-mpattern"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-mpattern-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "d359b3875bf1123a016400a494bafa0a58c54d12ecce478c8f285b66f03400f1de8ddc06fd54275156aca8c54577f6d4bab5ea040f902e9f9017ce10d59c78ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mpattern-doc-en;pl \
texlive-mpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
