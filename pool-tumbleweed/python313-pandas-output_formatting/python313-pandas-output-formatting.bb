SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-output_formatting-3.0.5-2.2.noarch.rpm"
RPM_HASH = "26c8def2153822e9ffaaf025cbb7c28acda66a90c56082d82039f39f68e1aeb2e6e0115a03050a45ffbaedf68faae6c79f68a67955636af26f095ed7ff2cc965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-output-formatting \
python313-pandas-output-formatting"

RDEPENDS:${PN} += "python313-Jinja2 \
python313-pandas \
python313-tabulate"

inherit rpm
