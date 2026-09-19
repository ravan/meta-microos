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

RPM_NAME = "python313-text-unidecode-1.3-3.5.noarch.rpm"
RPM_HASH = "c526fbb5d894060c4e6c6964fcf2cc043948d3befd27ebed1acbfc5ac2630fd691e782cd93d21c3039c225083bad80ad1b0482878e2bf99efd6c9b2b8e031790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-text-unidecode \
python3.13dist-text-unidecode \
python313-text-unidecode \
python3dist-text-unidecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
