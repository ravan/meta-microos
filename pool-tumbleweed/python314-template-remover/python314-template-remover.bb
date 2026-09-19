SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python314-template-remover-0.1.9-4.10.noarch.rpm"
RPM_HASH = "026752675a83e6edb4d79aa396d0d8bffaf3d08bc15e6379d2fc0d70954743e6f3388cc876b57c80f754331fa04fd0dc80ec4fb1ac7bddeaa3c243ef2e7f0e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-template-remover \
python314-template-remover \
python3dist-template-remover"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-docopt \
update-alternatives"

inherit rpm
