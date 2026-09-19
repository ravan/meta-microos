SUMMARY = "Development utilities by jaraco"
DESCRIPTION = "Development utilities by jaraco"
LICENSE = "MIT"

PV = "8.19.2"

RPM_NAME = "python314-jaraco.develop-8.19.2-1.3.noarch.rpm"
RPM_HASH = "c70d9c3e6b7305972f2b2470ebab79b728d5b99a32485fa512638ce982e10bdbe27d5d7e0161a66ea01049264ff6e01b84a150d3ad0969af3de720bbffc71256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.develop \
python314-jaraco.develop \
python3dist-jaraco.develop"

RDEPENDS:${PN} += "python-abi \
python314-PyNaCl \
python314-build \
python314-ini2toml \
python314-jaraco.context \
python314-jaraco.ui \
python314-jaraco.vcs \
python314-keyring \
python314-packaging \
python314-path \
python314-requests \
python314-requests-file \
python314-requests-toolbelt \
python314-setuptools \
python314-subprocess-tee \
python314-typer \
python314-typing-extensions"

inherit rpm
