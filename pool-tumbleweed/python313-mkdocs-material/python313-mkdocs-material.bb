SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.7.7"

RPM_NAME = "python313-mkdocs-material-9.7.7-1.1.noarch.rpm"
RPM_HASH = "a8c114278fb0c54753b44b5c4b9655aeedb59a803ff0776dce293ac50ef545ecc37032f15ed8523a6e242127450ee4d367f6292b2dc924658846c6af3028ab6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material \
python3.13dist-mkdocs-material \
python313-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "-python313-mkdocs >= 1.6 with python313-mkdocs < 2 \
python-abi \
python313-Babel \
python313-Jinja2 \
python313-Markdown \
python313-backrefs \
python313-click \
python313-colorama \
python313-mkdocs-material-extensions \
python313-paginate \
python313-pygments \
python313-pymdown-extensions \
python313-regex \
python313-requests"

inherit rpm
