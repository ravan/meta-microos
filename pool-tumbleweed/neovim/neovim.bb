SUMMARY = "Vim-fork focused on extensibility and agility"
DESCRIPTION = "Neovim is a refactor - and sometimes redactor - in the tradition of \
Vim, which itself derives from Stevie. It is not a rewrite, but a \
continuation and extension of Vim. Many rewrites, clones, emulators \
and imitators exist; some are very clever, but none are Vim. Neovim \
strives to be a superset of Vim, notwithstanding some intentionally \
removed misfeatures; excepting those few and carefully-considered \
excisions, Neovim is Vim. It is built for users who want the good \
parts of Vim, without compromise, and more."
LICENSE = "Apache-2.0 & Vim & GPL-3.0-or-later & CC-BY-3.0"

PV = "0.12.5"

RPM_NAME = "neovim-0.12.5-1.1.aarch64.rpm"
RPM_HASH = "2f45e9a4779fdca39344767bd18f1ab19060cdd485ac2008acae6b7b53841ba24ffc56e51aa87bb588eff482ab0c29dd499da55295420cb4eee744c9764240dd"

RPROVIDES:${PN} += "config-neovim \
neovim"

RDEPENDS:${PN} += "/usr/bin/sh \
gperf \
ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libluv.so.1 \
libm.so.6 \
libtree-sitter.so.0.26 \
libunibilium.so.4 \
libutf8proc.so.3 \
libuv.so.1 \
libvterm0 \
luajit-bit32 \
luajit-compat-5.3 \
luajit-lpeg \
luajit-luarocks \
luajit-luv \
tree-sitter \
tree-sitter-c \
tree-sitter-lua \
tree-sitter-markdown \
tree-sitter-python \
tree-sitter-query \
tree-sitter-vim \
tree-sitter-vimdoc \
xdg-utils"

inherit rpm
