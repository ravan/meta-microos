SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python313-curlylint-0.13.1-4.5.noarch.rpm"
RPM_HASH = "4b2e315e43fa40a55b812d52063183f10feb60292ff12136a198aeb99cba51ac72cc9ff456fa81c5606b9e7f059deb628ecf8db598a84143e240d2962cee07ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curlylint \
python3.13dist-curlylint \
python313-curlylint \
python3dist-curlylint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs \
python313-click \
python313-parsy \
python313-pathspec \
python313-toml"

inherit rpm
