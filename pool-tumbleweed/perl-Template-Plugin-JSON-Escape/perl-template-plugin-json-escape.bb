SUMMARY = "Adds a .json vmethod and a json filter"
DESCRIPTION = "This plugin allows you to embed JSON strings in HTML. In the output, \
special characters such as '<' and '&' are escaped as '\\uxxxx' to prevent \
XSS attacks. \
 \
It also provides decoding function to keep compatibility with \
Template::Plugin::JSON."
LICENSE = "MIT"

PV = "0.02"

RPM_NAME = "perl-Template-Plugin-JSON-Escape-0.02-1.27.noarch.rpm"
RPM_HASH = "baa3fc6bb7c5a01b7c3d9a97c5810563bf6fb6cdf681dfd7455d5b8f0e7df9d8b98332988b035fada95559141066212a9776e7ef9921e26f5ccf0b6900a60ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--JSON--Escape \
perl-Template-Plugin-JSON-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-JSON \
perl-Template"

inherit rpm
