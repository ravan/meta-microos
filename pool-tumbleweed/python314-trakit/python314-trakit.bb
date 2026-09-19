SUMMARY = "Guess additional information from track titles"
DESCRIPTION = "TrakIt is a track name parser created to solve a common, yet very specific \
problem, that is vagueness in metadata information."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python314-trakit-0.2.5-1.3.noarch.rpm"
RPM_HASH = "139d74b36794121a149184e2028812fe32f9b49479e992a8d3c58910bf5940568fae9cd9f922609475c52edef5f312b8c28acc3bdf9634156807e0bb142d93e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-trakit \
python314-trakit \
python3dist-trakit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-babelfish \
python314-rebulk \
update-alternatives"

inherit rpm
