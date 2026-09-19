SUMMARY = "Fish Completion for updatecli"
DESCRIPTION = "Fish command line completion support for updatecli."
LICENSE = "Apache-2.0"

PV = "0.120.1"

RPM_NAME = "updatecli-fish-completion-0.120.1-1.1.noarch.rpm"
RPM_HASH = "1a9bb911f5a55c961494a3bfbfc14b1fd26d39964e29d059eca6d2c4cbec356edaf379daa2b2ed2ce1b3d7ad8fe1dec159104958cd50311c1c8ea32929a8644a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "updatecli-fish-completion"

RDEPENDS:${PN} += "updatecli"

inherit rpm
