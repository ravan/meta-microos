SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.19.0"

RPM_NAME = "python314-pytest-mpl-0.19.0-1.1.noarch.rpm"
RPM_HASH = "634aeb27c8200d1c68aa40668277bab38bf33330b5c87d8105b58219d6c404d38172367f7d4af570a52fe452f693e3ecb3e5b4baff992688f73f0bfe96804ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-mpl \
python314-pytest-mpl \
python3dist-pytest-mpl"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-Pillow \
python314-matplotlib \
python314-packaging \
python314-pytest"

inherit rpm
