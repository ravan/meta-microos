SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.11.3"

RPM_NAME = "python314-ipyvuetify-1.11.3-1.2.noarch.rpm"
RPM_HASH = "81f0ed1788f301ff261662d0a3c820f8b645aa9631ca932b255b5b20ac26f6eefe451608dd6e21040968940be06d097057efbe77f96dc4e8d1af78f66efe9da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipyvuetify \
python314-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python314-ipyvue >= 1.7 with python314-ipyvue < 2 \
python-abi"

inherit rpm
