SUMMARY = "Set of SGML entities and XML/CSS style sheets for building X.org documentation"
DESCRIPTION = "This package provides a common set of SGML entities and XML/CSS style \
sheets used in building/formatting the documentation provided in other \
X.Org packages."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "xorg-sgml-doctools-1.12.1-1.7.noarch.rpm"
RPM_HASH = "06062d79204d55768fb51c46fd743715e894fc3340bcf7dad4feaf9aa8e0ebe198f3c4c7c9c4a2ab500c0a1cfa5bacc057e862fdb3cd03ba97906ab5ba2b304e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xorg-sgml-doctools \
xorg-sgml-doctools"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
