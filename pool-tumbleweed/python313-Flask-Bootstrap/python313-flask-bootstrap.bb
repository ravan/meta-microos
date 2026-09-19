SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "3.3.7.1"

RPM_NAME = "python313-Flask-Bootstrap-3.3.7.1-2.5.noarch.rpm"
RPM_HASH = "bf1399f404c461dd6851ecdf5289e5b6a2476710d42df507d369fb639406799990e4202a6c85c17610759eee5c5fd524ce19bd6d594c3cf3277f8f1e7a90497e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Bootstrap \
python3.13dist-flask-bootstrap \
python313-Flask-Bootstrap \
python3dist-flask-bootstrap"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-dominate \
python313-visitor"

inherit rpm
