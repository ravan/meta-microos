SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python314-urlextract-1.9.0-3.5.noarch.rpm"
RPM_HASH = "c646b16254b22797417e4adb4d4d29ffedb5cc042f64ccf72b2c61aff0eb071afaddef696b23798762d4e564b0fe23e75cd8f30ca26d648313decb4311a4f11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-urlextract \
python314-urlextract \
python3dist-urlextract"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-dnspython \
python314-filelock \
python314-idna \
python314-platformdirs \
python314-uritools \
update-alternatives"

inherit rpm
