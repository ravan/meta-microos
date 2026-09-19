SUMMARY = "Documentation for texlive-europasscv"
DESCRIPTION = "This package includes the documentation for texlive-europasscv"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn56829"

RPM_NAME = "texlive-europasscv-doc-2026.226.svn56829-59.2.noarch.rpm"
RPM_HASH = "9147d7746c418c633a53d5f56d1dc70193531a683d3b989d2d7b50a440f564c5ac2746e374a8abe7b1fa35e7a67ace523a6038436abf3522d9b2269e5b3f0c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-europasscv-doc"

RDEPENDS:${PN} += ""

inherit rpm
