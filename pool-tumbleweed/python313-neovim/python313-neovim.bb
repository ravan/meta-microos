SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python313-neovim-0.6.0-2.2.noarch.rpm"
RPM_HASH = "33f27fd5d9894b1b6077396f14a0238e1cce46904b8896ef8d8f67abd6e0a77335241575c8613292ba0ae95f3cd4475ea343b2f2d4bc24b23920e6325b6178df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-neovim \
python3-nvim \
python3.13dist-pynvim \
python313-neovim \
python313-nvim \
python3dist-pynvim"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
neovim \
python-abi \
python313-greenlet \
python313-msgpack \
update-alternatives"

inherit rpm
