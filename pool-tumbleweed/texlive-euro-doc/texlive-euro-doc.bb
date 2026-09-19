SUMMARY = "Documentation for texlive-euro"
DESCRIPTION = "This package includes the documentation for texlive-euro"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn22191"

RPM_NAME = "texlive-euro-doc-2026.226.1.1svn22191-59.2.noarch.rpm"
RPM_HASH = "7fb577ca82f0963078715051d0234ec2933d68570c44012c156639598db6e44f9bb255be68ba69d58268ef74c1622c788e81503131bf5f832d657813b3f39a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euro-doc"

RDEPENDS:${PN} += ""

inherit rpm
