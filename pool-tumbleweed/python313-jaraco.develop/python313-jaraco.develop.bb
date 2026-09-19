SUMMARY = "Development utilities by jaraco"
DESCRIPTION = "Development utilities by jaraco"
LICENSE = "MIT"

PV = "8.19.2"

RPM_NAME = "python313-jaraco.develop-8.19.2-1.3.noarch.rpm"
RPM_HASH = "ce2741ef67b88cef9c7154ab0abeccca0d314b45d85516df806df40466edb7250f9101c396d169ddd8b8adf64ce629ff18bac7ba1e4c05c56efc2553c4adefdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.develop \
python3.13dist-jaraco.develop \
python313-jaraco.develop \
python3dist-jaraco.develop"

RDEPENDS:${PN} += "python-abi \
python313-PyNaCl \
python313-build \
python313-ini2toml \
python313-jaraco.context \
python313-jaraco.ui \
python313-jaraco.vcs \
python313-keyring \
python313-packaging \
python313-path \
python313-requests \
python313-requests-file \
python313-requests-toolbelt \
python313-setuptools \
python313-subprocess-tee \
python313-typer \
python313-typing-extensions"

inherit rpm
