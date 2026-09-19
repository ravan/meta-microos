SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python313-pytest-check-links-0.10.1-1.10.noarch.rpm"
RPM_HASH = "58022dd34366d87f846dbc580bf13722ce54b4fbc43d0514a7f46a1d3589b9f8fb93ff7201a07c5ef682ef826ff74355c27626a3a6209a9cce1289a06c01fcc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check-links \
python3.13dist-pytest-check-links \
python313-pytest-check-links \
python3dist-pytest-check-links"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-docutils \
python313-html5lib \
python313-pytest \
python313-requests \
update-alternatives"

inherit rpm
