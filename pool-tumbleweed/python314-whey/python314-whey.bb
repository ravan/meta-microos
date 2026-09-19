SUMMARY = "A simple Python wheel builder for simple projects"
DESCRIPTION = "A simple Python wheel builder for simple projects."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-whey-0.1.1-5.2.noarch.rpm"
RPM_HASH = "8b48ab1050800abd36e86a112624b0c4af04aa3cfce43a421d3d0e8dc8b5216d23404e12b27bbe67f400095bebf6ae96988a5b0c3924e51da44340940fdb421b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-whey \
python314-whey \
python3dist-whey"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs \
python314-click \
python314-consolekit \
python314-dist-meta \
python314-dom-toml \
python314-domdf-python-tools \
python314-handy-archives \
python314-natsort \
python314-packaging \
python314-pyproject-parser \
python314-shippinglabel"

inherit rpm
