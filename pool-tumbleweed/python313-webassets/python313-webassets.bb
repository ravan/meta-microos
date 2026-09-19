SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python313-webassets-3.0.0-1.3.noarch.rpm"
RPM_HASH = "ee1016d4e9989793548914d51c19ca394225177327d45d256ce2d91e4b6ad12b3d0f8764f7d1c4b1dd2826f46a7f7c575b3df311d938b31ac9d34648db1d98f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webassets \
python3.13dist-webassets \
python313-webassets \
python3dist-webassets"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-zope.dottedname \
update-alternatives"

inherit rpm
