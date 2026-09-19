SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python313-XStatic-tv4-1.2.7.0-2.5.noarch.rpm"
RPM_HASH = "c1c10e99d12e70a10cf6aeb7ac7fb09b9552ba7a3633695f8a96bd4b043af1b8a7d56e8b56326fd3ea12c6c5b29e7d02eb68d30a797f756b0e06558c21ef4215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-tv4 \
python3.13dist-xstatic-tv4 \
python313-XStatic-tv4 \
python3dist-xstatic-tv4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
