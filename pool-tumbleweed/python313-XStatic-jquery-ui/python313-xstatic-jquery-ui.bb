SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python313-XStatic-jquery-ui-1.13.0.1-2.5.noarch.rpm"
RPM_HASH = "6ede9c3a33ed0162bae83214ca0c47c7222100544e5706549bb1c68cb412c38575834a7526a8806b447d203408d1e297c1dc74d5965904399d718dfe40964be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-jquery-ui \
python3.13dist-xstatic-jquery-ui \
python313-XStatic-jquery-ui \
python3dist-xstatic-jquery-ui"

RDEPENDS:${PN} += "python-abi \
python313-XStatic-jQuery"

inherit rpm
