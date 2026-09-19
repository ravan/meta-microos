SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-iso8601-2.1.0-1.10.noarch.rpm"
RPM_HASH = "71b609020f618f79cfff5076e6191f198b2e6f07a4cf58140b239e6757877a7bd3586fba46583f9b02162fae2fe5e2fd91e32ab2f9f41daa091bd4a1cec818e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iso8601 \
python3.13dist-iso8601 \
python313-iso8601 \
python3dist-iso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
