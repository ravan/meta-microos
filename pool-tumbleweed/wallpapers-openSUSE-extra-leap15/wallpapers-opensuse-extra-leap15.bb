SUMMARY = "wallpapers from openSUSE Leap 15."
DESCRIPTION = "This package contains wallpapers from openSUSE Leap 15."
LICENSE = "CC-BY-2.0 & CC-BY-SA-2.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "16"

RPM_NAME = "wallpapers-openSUSE-extra-leap15-16-2.2.noarch.rpm"
RPM_HASH = "9a82fffdfa4e3cc989bba92d3e50edca526b0d7fd1df682b76a25156e3a29174090e5f65e4c60b426e717593d0c2501188faa99edc3dbd42c4f55ac93c34c196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wallpapers-openSUSE-extra-leap15"

RDEPENDS:${PN} += ""

inherit rpm
