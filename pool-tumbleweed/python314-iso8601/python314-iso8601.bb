SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-iso8601-2.1.0-1.10.noarch.rpm"
RPM_HASH = "0fdf7effceb859963f64f4b95a1aa6e56ee596d8bd6f11cdc80cc0dd81aec6c3f6e4556fae7fdba01a8f79e12bc764dbfbc94122d95ef0f4170c5650931f9ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-iso8601 \
python314-iso8601 \
python3dist-iso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
