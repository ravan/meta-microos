SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "python314-pymetar-1.4-1.12.noarch.rpm"
RPM_HASH = "ff4edba63346af8642e41c537ccf6a15cbeee25cd9e437c979bb9d01b66420e80fc80097d10996ff8c75c6e91e27c8cb446a82497dd46f7713b2c169895d9cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymetar \
python314-pymetar \
python3dist-pymetar"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
