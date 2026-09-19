SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "3.3.7.1"

RPM_NAME = "python314-Flask-Bootstrap-3.3.7.1-2.5.noarch.rpm"
RPM_HASH = "81e17f8e262d63f986b9ee042df308b135899afface6c60b0d1be6cc405ba56c4e1d5abd1d4c745e4bc07dd8e6b7a605f4097769b4cad33e518687e086424fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-bootstrap \
python314-Flask-Bootstrap \
python3dist-flask-bootstrap"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-dominate \
python314-visitor"

inherit rpm
