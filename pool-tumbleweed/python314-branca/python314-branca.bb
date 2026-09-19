SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python314-branca-0.8.2-1.4.noarch.rpm"
RPM_HASH = "a4d5f707bd02c657bdc1d19f43212f160ce217779afc5031cd1d6327c55fb0a269b50c604f1348a6fa12fbbf0359f653100f843a2d294e1fbbf7829757c258d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-branca \
python314-branca \
python3dist-branca"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2"

inherit rpm
