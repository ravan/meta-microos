SUMMARY = "Javadoc for oro"
DESCRIPTION = "Javadoc for oro."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "oro-javadoc-2.0.8-298.8.noarch.rpm"
RPM_HASH = "9a9c79061e537ff3d787f213cae9adb77b4150b2626753666487cbccdf11535698437ff372206c0d6c777e1c35f94de669b715b5d4c3defc111b7f55ef65d466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oro-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
