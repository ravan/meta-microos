SUMMARY = "Documentation for texlive-fontwrap"
DESCRIPTION = "This package includes the documentation for texlive-fontwrap"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-fontwrap-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "3a68661e5105075740f64f0db450268a8ed72ba24ec41268afee45c96e81a78311537cfb774cddacc6b3e501c533b283d7383a438fd0d11f5007eaf9de6e5508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
