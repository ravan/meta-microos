SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "25.3.0"

RPM_NAME = "python314-gunicorn-25.3.0-1.3.noarch.rpm"
RPM_HASH = "667673a40d1cb91a693840264f6bfae73293ab85cee6b3a4e0b5c350185088e853e25154457e822db4703e33ea08992f2bf8e0a68d77fcaed51d1b7bdfb88005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gunicorn \
python314-gunicorn \
python3dist-gunicorn"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging"

inherit rpm
