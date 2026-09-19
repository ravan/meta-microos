SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python314-jinja2-pluralize-0.3.0-3.5.noarch.rpm"
RPM_HASH = "6852ad56d2765a7beee4944779a3026b217311006ae21446b59633bd2ec223a8b50ea643733c5f5aa677afa5f2affa89715630239bc73cc29f15c4616ed96734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jinja2-pluralize \
python314-jinja2-pluralize \
python3dist-jinja2-pluralize"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-inflect"

inherit rpm
