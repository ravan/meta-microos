SUMMARY = "Documentation for texlive-duerer"
DESCRIPTION = "This package includes the documentation for texlive-duerer"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn20741"

RPM_NAME = "texlive-duerer-doc-2026.226.svn20741-59.2.noarch.rpm"
RPM_HASH = "33017276b507ca14a4f9c131c11fed548d77e439979b0d70d6d78ec7bc49ac3ac90ac2ef26cd866afdc49e08eafc7a1dc786754e7127298ddbc56ef550854067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duerer-doc"

RDEPENDS:${PN} += ""

inherit rpm
