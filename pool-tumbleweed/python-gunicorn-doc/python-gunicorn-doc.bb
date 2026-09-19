SUMMARY = "Documentation for python-gunicorn"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks. \
 \
This package contains the documentation."
LICENSE = "MIT"

PV = "25.3.0"

RPM_NAME = "python-gunicorn-doc-25.3.0-1.3.noarch.rpm"
RPM_HASH = "5027ba03bbf99d5751a06c7ff0f0ab9400e4312200cf65cf0307f82a66e100b8bea032ce99c7db8736867fd0ef532c07353b3149ad37701334c3a00ad218d0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gunicorn-doc \
python313-gunicorn-doc \
python314-gunicorn-doc"

RDEPENDS:${PN} += ""

inherit rpm
