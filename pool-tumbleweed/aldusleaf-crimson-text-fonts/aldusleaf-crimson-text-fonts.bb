SUMMARY = "Crimson Text Serif Font"
DESCRIPTION = "Crimson Text is a font family for book production in the tradition \
of beautiful oldstyle typefaces. \
Crimson Text was born after years of discontent with the choice of \
free text typefaces. It is a friendly, classical old-style font for books."
LICENSE = "OFL-1.1"

PV = "20111206"

RPM_NAME = "aldusleaf-crimson-text-fonts-20111206-11.25.noarch.rpm"
RPM_HASH = "306a41e940815e5f0c006e5b2059f7765dbba5b745acdc901a4ae5cae93a495f6c992c0fc1806f10d75d17de9d10d6e85230c52358013b851db00af215cb6304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aldusleaf-crimson-text-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
