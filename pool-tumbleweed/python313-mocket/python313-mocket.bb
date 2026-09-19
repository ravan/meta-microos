SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.14.4"

RPM_NAME = "python313-mocket-3.14.4-1.1.noarch.rpm"
RPM_HASH = "cfc6cfce1d01c0991f32813bee05c94197356e48ccf07038c4732a055bbd854c8c4484757300228bca915aefb439b8e76750fe71622918647e2de573e08ecc00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mocket \
python3.13dist-mocket \
python313-mocket \
python3dist-mocket"

RDEPENDS:${PN} += "python-abi \
python313-decorator \
python313-h11 \
python313-puremagic \
python313-typing-extensions \
python313-urllib3"

inherit rpm
