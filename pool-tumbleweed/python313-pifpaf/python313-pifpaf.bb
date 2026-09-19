SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "python313-pifpaf-3.4.0-1.4.noarch.rpm"
RPM_HASH = "861fbb64dab7182090ba964cb9dcd5f41786ed6aeedf7b0ad726a9b29bd1ad9d3607809107cad70258049afa09f7fb686d2c5f06bf9575111c26d77868ec728c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pifpaf \
python3.13dist-pifpaf \
python313-pifpaf \
python3dist-pifpaf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-click \
python313-daiquiri \
python313-fixtures \
python313-psutil \
python313-requests \
python313-testrepository \
python313-testtools \
python313-xattr"

inherit rpm
