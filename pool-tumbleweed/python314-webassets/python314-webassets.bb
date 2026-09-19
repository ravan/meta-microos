SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python314-webassets-3.0.0-1.3.noarch.rpm"
RPM_HASH = "bd0956c1fc6569bf35ed5e2a21d0c278b0dd9271c4abbe77e507a1b2c8ec54ec55a67d9f359466b0ff823191c93f1f098abb587378edfd114d3d4d8f71a792f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-webassets \
python314-webassets \
python3dist-webassets"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-zope.dottedname \
update-alternatives"

inherit rpm
