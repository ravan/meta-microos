SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python314-XStatic-jquery-ui-1.13.0.1-2.5.noarch.rpm"
RPM_HASH = "a0030f46eef346aec9c5725ea03465a9ce3ec0dc864a6ee53b60f48c3f260a7b504f37ca97f6cbbfb4502c25e4edc72dc98afc23646de9d5dfaaa4b0d607d781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xstatic-jquery-ui \
python314-XStatic-jquery-ui \
python3dist-xstatic-jquery-ui"

RDEPENDS:${PN} += "python-abi \
python314-XStatic-jQuery"

inherit rpm
