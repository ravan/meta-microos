SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "python313-pymetar-1.4-1.12.noarch.rpm"
RPM_HASH = "19c12acff00b9cb8374dd7be2eb5843902fb17493434aefd2bbd18716f7bd9e2dbb272f8e0aba8530d3630663202fb154014a2591bc6181917bf12dc5d793caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymetar \
python3.13dist-pymetar \
python313-pymetar \
python3dist-pymetar"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
