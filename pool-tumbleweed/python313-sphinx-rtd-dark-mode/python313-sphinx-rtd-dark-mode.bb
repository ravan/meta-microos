SUMMARY = "Dark mode for the Sphinx Read the Docs theme"
DESCRIPTION = "Dark mode for the Sphinx Read the Docs theme."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-sphinx-rtd-dark-mode-1.3.0-1.2.noarch.rpm"
RPM_HASH = "52815b64ec6911b132b1dfac47d90d4d594faa9abd9c2203973d2536bdc820a695ab13aa9e782b7c3d881be1f0802f1415c18dc8e4042b807e072c76115f41cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-rtd-dark-mode \
python3.13dist-sphinx-rtd-dark-mode \
python313-sphinx-rtd-dark-mode \
python3dist-sphinx-rtd-dark-mode"

RDEPENDS:${PN} += "python-abi \
python313-sphinx-rtd-theme"

inherit rpm
