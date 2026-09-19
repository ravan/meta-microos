SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2025.12.21.14"

RPM_NAME = "python313-sphinx-inline-tabs-2025.12.21.14-1.4.noarch.rpm"
RPM_HASH = "b8b55eeaddde753dd2c4b2adbe020774a03c085bd9b23deacee829ec7fc0da094b329d145a3e1d244332d7630d51fba2483b4192886a08ca7a624bed2a805c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-inline-tabs \
python3.13dist-sphinx-inline-tabs \
python313-sphinx-inline-tabs \
python3dist-sphinx-inline-tabs"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
