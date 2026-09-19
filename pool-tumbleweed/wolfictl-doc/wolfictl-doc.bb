SUMMARY = "Documentation for wolfictl"
DESCRIPTION = "wolfictl is a command line tool for working with Wolfi"
LICENSE = "Apache-2.0"

PV = "0.39.25"

RPM_NAME = "wolfictl-doc-0.39.25-1.1.noarch.rpm"
RPM_HASH = "e0893886759ee82eb90041d657aa211a27c5f9cc0e7a53139479684ec54dc00be30457a0d785d0e0b4b983d55aec4fd51b4cbd30e300a8e16a54484ebbceb266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wolfictl-doc"

RDEPENDS:${PN} += ""

inherit rpm
