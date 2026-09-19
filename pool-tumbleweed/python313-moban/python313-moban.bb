SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python313-moban-0.8.2-4.5.noarch.rpm"
RPM_HASH = "93e75ff5df1f689e887e2ef2760cf4708bdd4ecab0f5552c6727cd2e27fdef02b67ad6b05cabc4146e5a7dc5b41e7870828e54078868809294f30d66a9fab74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moban \
python3.13dist-moban \
python313-moban \
python3dist-moban"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
git-core \
python-abi \
python313-Jinja2 \
python313-appdirs \
python313-crayons \
python313-fs \
python313-jinja2-fsloader \
python313-lml \
python313-ruamel.yaml"

inherit rpm
