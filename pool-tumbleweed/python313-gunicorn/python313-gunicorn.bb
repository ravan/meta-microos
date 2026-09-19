SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "25.3.0"

RPM_NAME = "python313-gunicorn-25.3.0-1.3.noarch.rpm"
RPM_HASH = "77e563bb4891e9fc28c658831053718e096bc311c0d3203bc18c49c1cb10c129df3dcf4dca4f6393a4f525e5bfda75047f0bf13df37a55b6558525a8eb6f108c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gunicorn \
python3.13dist-gunicorn \
python313-gunicorn \
python3dist-gunicorn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging"

inherit rpm
