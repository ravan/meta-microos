SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python311-webassets-3.0.0-1.1.noarch.rpm"
RPM_HASH = "1d86ab71a0c29e0f45f568104d1a27414d71b8395d0637ba5b6001afa76b80f74a242fa6c6560f90bbcd81d523ac5e4bff43045c2613c9fcbae9bad4bfd47aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-webassets \
python311-webassets \
python3dist-webassets"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-zope.dottedname \
update-alternatives"

inherit rpm
