SUMMARY = "Unicode Emoji Data Files"
DESCRIPTION = "Unicode Emoji Data Files are the machine-readable \
emoji data files associated with \
http://www.unicode.org/reports/tr51/index.html"
LICENSE = "Unicode"

PV = "15.1"

RPM_NAME = "unicode-emoji-15.1-1.9.noarch.rpm"
RPM_HASH = "fe66e0054dfb2ddac29429913df88c580f31b4ffb722cb914f48967dc42faadc2a86165e31d6efa52ef4f673841a2e839333e5de77d95d1bb0ff42aa9fc870fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-emoji"

RDEPENDS:${PN} += ""

inherit rpm
