SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python313-XStatic-objectpath-1.2.1.0-2.5.noarch.rpm"
RPM_HASH = "7ceda537fb5a3e30d460b08fd6f68f1bafd796aea43b4bc629246d77cd06142479c025335917dcc58843942aa1c1644b9dba83fb3aeb9ef76aab20f887740972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-objectpath \
python3.13dist-xstatic-objectpath \
python313-XStatic-objectpath \
python3dist-xstatic-objectpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
