SUMMARY = "The most basic Text::Unidecode port"
DESCRIPTION = "text-unidecode is the most basic port of the Text::Unidecode Perl library. \
 \
There are other Python ports of Text::Unidecode (unidecode and \
isounidecode). unidecode is GPL; isounidecode doesn’t support Python 3 \
and uses too much memory. \
 \
This port is licensed under Artistic License and supports both Python \
2.x and 3.x."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "python314-text-unidecode-1.3-3.5.noarch.rpm"
RPM_HASH = "de5af1605566cfb0b279be7eeff6c78917a9328b748d6eb523b8b6282d9b3859deff2e0b3d495a4510602e097b73678f12950f0dd8edad885be9652d6a9da802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-text-unidecode \
python314-text-unidecode \
python3dist-text-unidecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
