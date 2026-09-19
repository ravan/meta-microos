SUMMARY = "Documentation for texlive-addfont"
DESCRIPTION = "This package includes the documentation for texlive-addfont"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn58559"

RPM_NAME = "texlive-addfont-doc-2026.226.1.1svn58559-61.2.noarch.rpm"
RPM_HASH = "f038fda152837de3b9277b3686d9235296a47f01ef2c433b9ea8018c743553ef05b50c9f56b1eb1a44eae1e34784e7f304738eb4478fbc063da7ce61d9ae2b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
