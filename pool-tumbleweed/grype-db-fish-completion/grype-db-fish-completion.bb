SUMMARY = "Fish Completion for grype-db"
DESCRIPTION = "Fish command line completion support for grype-db."
LICENSE = "Apache-2.0"

PV = "0.54.3"

RPM_NAME = "grype-db-fish-completion-0.54.3-1.1.noarch.rpm"
RPM_HASH = "35e410c64fe226dd623c1d37b22359d5c9d2d1bd64ffec624546c8bd8ed429dd45cc768d155c800ff2939b7fc40afcc5da011a25730b09af02f5ed8d4fff89bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grype-db-fish-completion"

RDEPENDS:${PN} += "grype-db"

inherit rpm
