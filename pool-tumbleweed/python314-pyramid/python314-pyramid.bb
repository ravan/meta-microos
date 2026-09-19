SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.1"

RPM_NAME = "python314-pyramid-2.1-1.2.noarch.rpm"
RPM_HASH = "045704715aee282c0778392cb9793dfb761c7b643e9b1ef0563a3c22c5217a8500a9ec14f703bfcadbd7159dbaa5cbab36f861392bd11afb3856121decf50eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyramid \
python314-pyramid \
python3dist-pyramid"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-WebOb \
python314-hupper \
python314-plaster \
python314-plaster-pastedeploy \
python314-setuptools \
python314-translationstring \
python314-venusian \
python314-zope.deprecation \
python314-zope.interface \
update-alternatives"

inherit rpm
