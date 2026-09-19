SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "45.0"

RPM_NAME = "python314-readme_renderer-45.0-1.1.noarch.rpm"
RPM_HASH = "a62a6aa11afc76990e8f909d0a8fde9bab2e8d2e6d837d7bfde6e05a9e9d942e0af28716bb752425867e693cef9b2cb4e9fbff1633cdd79e2c82f9d90c03f2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-readme-renderer \
python314-readme-renderer \
python3dist-readme-renderer"

RDEPENDS:${PN} += "python-abi \
python314-Pygments \
python314-docutils \
python314-nh3"

inherit rpm
