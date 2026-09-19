SUMMARY = "Implements some of TextMate's snippets features in Vim"
DESCRIPTION = "snipMate aims to be an unobtrusive, concise vim script that implements some of \
TextMate's snippets features in Vim. A snippet is a piece of often-typed text \
that you can insert into your document using a trigger word followed by a \
<tab>. \
 \
For instance, in a C file using the default installation of snipMate.vim, if \
you type 'for<tab>' in insert mode, it will expand a typical for loop in C: \
 \
for (i = 0; i < count; i++) { \
}"
LICENSE = "MIT"

PV = "0.83"

RPM_NAME = "vim-plugin-snipmate-0.83-64.2.noarch.rpm"
RPM_HASH = "0a630e8d6f003a7bb3f3308e71f2e1d4a91eb0b3d2f7f4eb8ba13c0c59ff56deb4d4436a84692d604294a3de799676ba9b8a359a2cf5775e92da2d7e65c043e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-snipmate"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
