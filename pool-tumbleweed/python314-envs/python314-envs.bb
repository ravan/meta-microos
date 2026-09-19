SUMMARY = "Easy access of environment variables from Python"
DESCRIPTION = "Easy access of environment variables from Python with support for typing \
(ex. booleans, strings, lists, tuples, integers, floats, and dicts). \
Now with CLI settings file converter."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "python314-envs-1.4-2.4.noarch.rpm"
RPM_HASH = "fea080c425205a8617ecca5c6ac475c6b26fa388304e6e062e8275391b7773be1266bd87f381fc21f8944aa99d91fd6425be97daa670484f46c23827cf1c5967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-envs \
python314-envs \
python3dist-envs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-click \
python314-terminaltables3 \
update-alternatives"

inherit rpm
