SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python314-pytest-check-links-0.10.1-1.10.noarch.rpm"
RPM_HASH = "7b74ed7a26adb0bc10ea66eb032c934b51ae8cb94685e8eb6a1c0716348b4ec33f1537149c3e8651fe33f0c6c594d2326ed41d1279a65c4defd312b7e6435b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-check-links \
python314-pytest-check-links \
python3dist-pytest-check-links"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-docutils \
python314-html5lib \
python314-pytest \
python314-requests \
update-alternatives"

inherit rpm
