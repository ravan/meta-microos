SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python314-XStatic-tv4-1.2.7.0-2.5.noarch.rpm"
RPM_HASH = "392f9f6074d28b6f83a66efa3f23f8773e01c4b8b0fcf4792f058fb33a23bd7e567a6ec65f5255e8ef955edb6ce98d4cc26faf9d1e940aad0c74fc03ba71d13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xstatic-tv4 \
python314-XStatic-tv4 \
python3dist-xstatic-tv4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
