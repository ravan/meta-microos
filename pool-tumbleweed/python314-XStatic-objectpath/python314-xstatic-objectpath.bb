SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python314-XStatic-objectpath-1.2.1.0-2.5.noarch.rpm"
RPM_HASH = "95e2a6bb49517935e86750a49b66f277ec19c34665efbfc373804e17cc088c442d2cb9bfff560b768bffa5e2d9171db7b065330ed508904c7591717c90d85865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xstatic-objectpath \
python314-XStatic-objectpath \
python3dist-xstatic-objectpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
