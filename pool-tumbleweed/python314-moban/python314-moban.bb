SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python314-moban-0.8.2-4.5.noarch.rpm"
RPM_HASH = "58b458323ad32ef352f17e6a853f323bec5c67151ff8027fcd52416c52b84bbc2a8f00ea905919762e1327ee2ced68752b9fc25f235362b74cca722b2a83d54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-moban \
python314-moban \
python3dist-moban"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
git-core \
python-abi \
python314-Jinja2 \
python314-appdirs \
python314-crayons \
python314-fs \
python314-jinja2-fsloader \
python314-lml \
python314-ruamel.yaml"

inherit rpm
