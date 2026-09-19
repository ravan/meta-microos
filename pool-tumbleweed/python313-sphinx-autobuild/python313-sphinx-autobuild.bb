SUMMARY = "Rebuild Sphinx documentation on changes, with live-reload in the browser"
DESCRIPTION = "Rebuild Sphinx documentation on changes, with live-reload in the browser."
LICENSE = "MIT"

PV = "2025.8.25"

RPM_NAME = "python313-sphinx-autobuild-2025.8.25-1.4.noarch.rpm"
RPM_HASH = "ce70a554ae68998e3cee6532de07b806885eb5c96224520866690063346cd89a40a2de48465c2ae68289b8fa0d760c314d4d704d30bdf82295b5d118e3c89fe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autobuild \
python3.13dist-sphinx-autobuild \
python313-sphinx-autobuild \
python3dist-sphinx-autobuild"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Sphinx \
python313-colorama \
python313-watchfiles \
update-alternatives"

inherit rpm
