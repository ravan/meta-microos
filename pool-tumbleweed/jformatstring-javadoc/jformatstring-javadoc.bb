SUMMARY = "Javadoc for jformatstring"
DESCRIPTION = "Javadoc for jformatstring."
LICENSE = "GPL-2.0-only"

PV = "0.10~20131207"

RPM_NAME = "jformatstring-javadoc-0.10~20131207-4.9.noarch.rpm"
RPM_HASH = "e9d5fd215bc95bc02082bb71cfa91acf821302541910326e3c1efcfd0810bde0ef6b4fbdee18068d9b28849a091d16c4b9c0ab0b68de502a687acd3638561afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jformatstring-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
