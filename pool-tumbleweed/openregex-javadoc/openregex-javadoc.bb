SUMMARY = "Javadoc for openregex"
DESCRIPTION = "This package contains javadoc for openregex."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "openregex-javadoc-1.1.1-4.6.noarch.rpm"
RPM_HASH = "97ce97df479f875f4c998f7e6ce6923f7854698cd0b2e4dc2b8f3c94f779a68ec67a46c389d095df34784385133cab22e9d15b05528c191a8f6572e4cf50efd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openregex-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
