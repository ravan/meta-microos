SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.1"

RPM_NAME = "python313-pyramid-2.1-1.2.noarch.rpm"
RPM_HASH = "8c50f4f7ae0b836d6f5b1964ab4d04d45d5fd9fc8745068341360236ab341aaf815e7c995fee63b22d0d48341565439e2f5379815afbcfec6148e4fb149d120e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid \
python3.13dist-pyramid \
python313-pyramid \
python3dist-pyramid"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-WebOb \
python313-hupper \
python313-plaster \
python313-plaster-pastedeploy \
python313-setuptools \
python313-translationstring \
python313-venusian \
python313-zope.deprecation \
python313-zope.interface \
update-alternatives"

inherit rpm
