SUMMARY = "Binary files of ctanbib"
DESCRIPTION = "Binary files of ctanbib"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn48478"

RPM_NAME = "texlive-ctanbib-bin-2026.20260301.svn48478-120.4.aarch64.rpm"
RPM_HASH = "291f4bb09f9bcb404c24a52b832e3a3e4fee3c792dca50b856a30c3d288eb8585fb760740d3893161ba51d3bed07a54a8b855a8011108eb38218b9c99c08e438"

RPROVIDES:${PN} += "texlive-ctanbib-bin"

RDEPENDS:${PN} += "texlive-ctanbib"

inherit rpm
