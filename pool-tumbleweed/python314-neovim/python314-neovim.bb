SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python314-neovim-0.6.0-2.2.noarch.rpm"
RPM_HASH = "3e4615d5224c520284aac12be4c82641ceb3b3a341b2565d6e0a71e7c300e7d7d93d9c5b53f96e7628d552fa0837ad7c0796be8ff11fb4a0e5d0327702273c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pynvim \
python314-neovim \
python314-nvim \
python3dist-pynvim"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
neovim \
python-abi \
python314-greenlet \
python314-msgpack \
update-alternatives"

inherit rpm
