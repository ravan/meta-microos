SUMMARY = "Easy access of environment variables from Python"
DESCRIPTION = "Easy access of environment variables from Python with support for typing \
(ex. booleans, strings, lists, tuples, integers, floats, and dicts). \
Now with CLI settings file converter."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "python313-envs-1.4-2.4.noarch.rpm"
RPM_HASH = "17e481d20aeaabadee43952d3faff060fbaedef97049ea2b4095d84f777c09c57d5464a0f750aeff31ae1e44fd2f055d763e9814de36b4393c7528186d7989f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-envs \
python3.13dist-envs \
python313-envs \
python3dist-envs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-click \
python313-terminaltables3 \
update-alternatives"

inherit rpm
