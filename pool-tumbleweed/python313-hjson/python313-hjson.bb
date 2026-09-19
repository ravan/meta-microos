SUMMARY = "Hjson, a user interface for JSON"
DESCRIPTION = "Hjson, a user interface for JSON."
LICENSE = "MIT"

PV = "3.1.0+git.1762077481.9351a27"

RPM_NAME = "python313-hjson-3.1.0+git.1762077481.9351a27-2.2.noarch.rpm"
RPM_HASH = "f299c4323aeb9ed2b8ab75f8437a5504db7bb57fd7375741c3af934cd91b30f962215ada0204fec649e9abd442f57dbf9635c83bf538042322bd78ca3b9b6d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hjson \
python3.13dist-hjson \
python313-hjson \
python3dist-hjson"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
