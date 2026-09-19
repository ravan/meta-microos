SUMMARY = "Documentation for texlive-lpform"
DESCRIPTION = "This package includes the documentation for texlive-lpform"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn36918"

RPM_NAME = "texlive-lpform-doc-2026.226.svn36918-61.2.noarch.rpm"
RPM_HASH = "6468d3752699d1d28053b2c5a5ca8f200ca11f357c99353c50244c3fd32a74d94718ef7e8a7c06ed22be7de833f45b211e61afa79bdd61ce8d43cc350d80b612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lpform-doc"

RDEPENDS:${PN} += ""

inherit rpm
