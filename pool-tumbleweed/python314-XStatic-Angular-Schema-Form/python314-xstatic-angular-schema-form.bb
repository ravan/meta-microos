SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python314-XStatic-Angular-Schema-Form-0.8.13.0-3.5.noarch.rpm"
RPM_HASH = "17a8cddb646947f0e0a62b81472d1cf3d9ae570eb0ee1a1b5aa0722f08b4f754be24721741c610a27333756ea644af120d493e292f3b8bb3bd1df4d2ac8fecc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xstatic-angular-schema-form \
python314-XStatic-Angular-Schema-Form \
python3dist-xstatic-angular-schema-form"

RDEPENDS:${PN} += "python-abi"

inherit rpm
