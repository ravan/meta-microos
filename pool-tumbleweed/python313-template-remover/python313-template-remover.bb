SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python313-template-remover-0.1.9-4.10.noarch.rpm"
RPM_HASH = "6afbb99af47acb5c1abb91a08bfdf2611d388c610d77407648cc39ba6844fc7f030f1936d164213535d2dfef771acd563f76982c87e22e260b19c522f164ad41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-template-remover \
python3.13dist-template-remover \
python313-template-remover \
python3dist-template-remover"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-docopt \
update-alternatives"

inherit rpm
