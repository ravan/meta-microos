SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "3.3.4"

RPM_NAME = "python314-mistune-3.3.4-1.1.noarch.rpm"
RPM_HASH = "cb242042dea1055b4dfe5fbb3b485f67fcf0dc0ac09c1125504b31aea4a0007e8cf49deff5fc2628fc6c533a070d7af1921ed20e034ec66486a79d2ae83c8137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mistune \
python314-mistune \
python3dist-mistune"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi"

inherit rpm
