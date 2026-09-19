SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "45.0"

RPM_NAME = "python313-readme_renderer-45.0-1.1.noarch.rpm"
RPM_HASH = "d6d325373b854fea6cff3fd0b7e926b2f9dc061800559392e6fe16159f07954acea408ffcf893ad09e8a0a845dc3e5941aec8672481680b298c768633728828c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-readme-renderer \
python3.13dist-readme-renderer \
python313-readme-renderer \
python3dist-readme-renderer"

RDEPENDS:${PN} += "python-abi \
python313-Pygments \
python313-docutils \
python313-nh3"

inherit rpm
