SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.7.7"

RPM_NAME = "python314-mkdocs-material-9.7.7-1.1.noarch.rpm"
RPM_HASH = "eab70cd511091e3db34ed29749fdbd49e222076af3ae82122862ae2d5c9a1d8ae42dc348901028a7cc9be28b3ad32e99d6088ae865bace2e09ae445bb68f19d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mkdocs-material \
python314-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "-python314-mkdocs >= 1.6 with python314-mkdocs < 2 \
python-abi \
python314-Babel \
python314-Jinja2 \
python314-Markdown \
python314-backrefs \
python314-click \
python314-colorama \
python314-mkdocs-material-extensions \
python314-paginate \
python314-pygments \
python314-pymdown-extensions \
python314-regex \
python314-requests"

inherit rpm
