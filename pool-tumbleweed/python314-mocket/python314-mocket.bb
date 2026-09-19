SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.14.4"

RPM_NAME = "python314-mocket-3.14.4-1.1.noarch.rpm"
RPM_HASH = "207a7eda93cc902c07606e0590167e02993218b3b5c1f41796a86c9753d73dd36b2049822683d027f6017da43cdb708a0475edccc5a15672cf0c5992619bb39b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mocket \
python314-mocket \
python3dist-mocket"

RDEPENDS:${PN} += "python-abi \
python314-decorator \
python314-h11 \
python314-puremagic \
python314-typing-extensions \
python314-urllib3"

inherit rpm
