SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.9"

RPM_NAME = "python313-vobject-0.9.9-3.5.noarch.rpm"
RPM_HASH = "92d6d7bf5d1ac9efb36b079ca6447bd203ea8f6dacdce2d27615c83a5d0bfc9c6bd1ea1bd1aaf8190b8de1ed8b5b58982595e9cdad2275b2146ea0b8b82b5a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vobject \
python3.13dist-vobject \
python313-vobject \
python3dist-vobject \
vobject"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-python-dateutil \
python313-pytz"

inherit rpm
