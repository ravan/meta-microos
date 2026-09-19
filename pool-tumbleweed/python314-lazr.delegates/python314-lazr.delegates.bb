SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.1.1"

RPM_NAME = "python314-lazr.delegates-2.1.1-1.3.noarch.rpm"
RPM_HASH = "43263eea26a291330fbbee91cbc78c627b56ed887450471557262dfb51fea571364f373e2c5b63848ec073ba6d07e7e783d74202ba6295e1f45f8d7b411470bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazr.delegates \
python314-lazr.delegates \
python3dist-lazr.delegates"

RDEPENDS:${PN} += "python-abi \
python314-zope.interface"

inherit rpm
