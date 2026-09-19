SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.9"

RPM_NAME = "python314-vobject-0.9.9-3.5.noarch.rpm"
RPM_HASH = "14fd77fba0962487fd28e2374e1e6624646152c685bb912201433549b3c484c759a2719cb3791204482d6ec165c426e634047030238c6cd93c44b1974fa3cccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vobject \
python314-vobject \
python3dist-vobject \
vobject"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-python-dateutil \
python314-pytz"

inherit rpm
