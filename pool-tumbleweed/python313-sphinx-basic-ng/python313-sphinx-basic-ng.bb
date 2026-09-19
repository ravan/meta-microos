SUMMARY = "A modern skeleton for Sphinx themes"
DESCRIPTION = "A modern skeleton for Sphinx themes."
LICENSE = "MIT"

PV = "1.0.0.beta2"

RPM_NAME = "python313-sphinx-basic-ng-1.0.0.beta2-1.12.noarch.rpm"
RPM_HASH = "f3d7503dd7bbbb22d4d0cb24bd28e9df24dbe811717098b19127d1867f18b1ffa02e255b90dec3a2339fb15db04bf806ab334da301eebf2db5a2be5104789a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-basic-ng \
python3.13dist-sphinx-basic-ng \
python313-sphinx-basic-ng \
python3dist-sphinx-basic-ng"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
