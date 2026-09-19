SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python314-curlylint-0.13.1-4.5.noarch.rpm"
RPM_HASH = "25039f7c7038fd79fa9e78cdc93698998857e42c82fa1fdd124d6429af1127b2786fde8515d40707ff7c6e691c407253f1c4d663acac41e1fb3049794e106ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-curlylint \
python314-curlylint \
python3dist-curlylint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs \
python314-click \
python314-parsy \
python314-pathspec \
python314-toml"

inherit rpm
