SUMMARY = "Documentation for texlive-frankenstein"
DESCRIPTION = "This package includes the documentation for texlive-frankenstein"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-frankenstein-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "95fafcdf61629b76bd68a9b5c27241afee5fe3c5b7064de2469108bb682a84349421718890ceff749c605decacd9a1e528397136ddb6cb785eff93784afb4cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frankenstein-doc"

RDEPENDS:${PN} += ""

inherit rpm
