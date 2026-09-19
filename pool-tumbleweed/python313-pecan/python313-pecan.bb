SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python313-pecan-1.8.0-1.2.noarch.rpm"
RPM_HASH = "11bd80db55b4d9db7969551873a342657b4239af0bb33f899e5066930424d30ebf83ba274f2b7b16079afd7aa9b2d9bca9bc008c9bdde8aafbad42b1eed78d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pecan \
python3.13dist-pecan \
python313-pecan \
python3dist-pecan"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Mako \
python313-WebOb \
python313-WebTest \
python313-setuptools"

inherit rpm
