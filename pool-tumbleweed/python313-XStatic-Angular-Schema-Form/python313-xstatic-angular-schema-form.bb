SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python313-XStatic-Angular-Schema-Form-0.8.13.0-3.5.noarch.rpm"
RPM_HASH = "be791229c7baa580cf3d1b898a384254479aecc533be33bd4654827359bf703939d2f005e7989eca05d7ba7135cea583feba748701cd48c5a2b87647872ef523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-Angular-Schema-Form \
python3.13dist-xstatic-angular-schema-form \
python313-XStatic-Angular-Schema-Form \
python3dist-xstatic-angular-schema-form"

RDEPENDS:${PN} += "python-abi"

inherit rpm
