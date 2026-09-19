SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.19.0"

RPM_NAME = "python313-pytest-mpl-0.19.0-1.1.noarch.rpm"
RPM_HASH = "46db02e5493197494be085d8346649eec3d23fd06289b919dff841996127641710b6233b1400f0aaa3256271c164085d6901c2ecfd268e1e96d30cb2a32b2c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mpl \
python3.13dist-pytest-mpl \
python313-pytest-mpl \
python3dist-pytest-mpl"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-Pillow \
python313-matplotlib \
python313-packaging \
python313-pytest"

inherit rpm
