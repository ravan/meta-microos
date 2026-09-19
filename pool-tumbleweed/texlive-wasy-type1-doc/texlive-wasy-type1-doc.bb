SUMMARY = "Documentation for texlive-wasy-type1"
DESCRIPTION = "This package includes the documentation for texlive-wasy-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-doc-2026.226.001.002svn53534-60.2.noarch.rpm"
RPM_HASH = "b16306c5ae20623260fecfcc77f4fafb6107aa8da7e8bc5274477575c418dfbc1153c19c809f24612bfb219a03c30de00b40f47f115313833342e76aa4499b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasy-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
