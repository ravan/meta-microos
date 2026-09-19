SUMMARY = "Documentation for texlive-cdpbundl"
DESCRIPTION = "This package includes the documentation for texlive-cdpbundl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.36dsvn61719"

RPM_NAME = "texlive-cdpbundl-doc-2026.226.0.0.36dsvn61719-59.2.noarch.rpm"
RPM_HASH = "3178b839fb0108523755cf0fda1a70a931875bd315fdd6bdbde546372a3e8e00233c54c289cd7a8bf9fb36c2828723112fc5348c205ed068e5e9abd24b7fa400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cdpbundl-doc"

RDEPENDS:${PN} += ""

inherit rpm
