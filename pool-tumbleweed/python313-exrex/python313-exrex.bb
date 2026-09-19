SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.12.0"

RPM_NAME = "python313-exrex-0.12.0-1.2.noarch.rpm"
RPM_HASH = "54720cfa16e76249c148fc33e20092ed72d51d365b54e299e00605530738724855cc2aa2790d1edad4824d399be03e8007c62ac9fa255948f0cf8133c652e236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exrex \
python3.13dist-exrex \
python313-exrex \
python3dist-exrex"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
