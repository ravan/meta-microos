SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python314-j2gen-0.1.0-5.5.noarch.rpm"
RPM_HASH = "c8419c9849ee3a4d7ea365024bb130107f0d828ba69224722ffd57d52bda2220dc9608cac676beca144a17d10070a99cbc8e0476b1b57961879e19bb346352de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-j2gen \
python314-j2gen \
python3dist-j2gen"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-PyYAML"

inherit rpm
