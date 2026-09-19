SUMMARY = "Javadoc for minlog"
DESCRIPTION = "This package contains javadoc for minlog."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "minlog-javadoc-1.3.1-2.11.noarch.rpm"
RPM_HASH = "b517ce9fb365e8a5b71106db966d9a4158f0b1f619a4be0173138723c4ae7e9e435461d8aa6897a12885c6242ac89000c58c7ee9b490980118d85697868b1a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
