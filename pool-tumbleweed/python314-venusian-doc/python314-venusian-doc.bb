SUMMARY = "Documentation for python314-venusian"
DESCRIPTION = "This package contains documentation files for python314-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.1.1"

RPM_NAME = "python314-venusian-doc-3.1.1-1.7.noarch.rpm"
RPM_HASH = "918241348ca060cbc7b458f4b94c8440d874cd97806c010af7fcd4048e9813b563099e6602d74ff6bd08ebaad2f23e285a295600c11d048a92406cf54cc2664a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-venusian-doc"

RDEPENDS:${PN} += "python314-venusian"

inherit rpm
