SUMMARY = "Fish Completion for falcoctl"
DESCRIPTION = "Fish command line completion support for falcoctl."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "falcoctl-fish-completion-0.13.0-1.4.noarch.rpm"
RPM_HASH = "f3e617f420b76971235d1a1d53a7d68ecb0773b5f773d26c7e5736238c0320777d142bdc57d4fb1fdee5b382da071fbb77206e83ae4cd8898f8d12a01fe15b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falcoctl-fish-completion"

RDEPENDS:${PN} += "falcoctl"

inherit rpm
