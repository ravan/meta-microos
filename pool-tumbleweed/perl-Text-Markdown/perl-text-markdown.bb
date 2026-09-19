SUMMARY = "Convert Markdown syntax to (X)HTML"
DESCRIPTION = "Markdown is a text-to-HTML filter; it translates an easy-to-read / \
easy-to-write structured text format into HTML. Markdown's text format is \
most similar to that of plain text email, and supports features such as \
headers, *emphasis*, code blocks, blockquotes, and links. \
 \
Markdown's syntax is designed not as a generic markup language, but \
specifically to serve as a front-end to (X)HTML. You can use span-level \
HTML tags anywhere in a Markdown document, and you can use block level HTML \
tags (like <div> and <table> as well)."
LICENSE = "BSD-3-Clause"

PV = "1.000031"

RPM_NAME = "perl-Text-Markdown-1.000031-17.19.noarch.rpm"
RPM_HASH = "de2881019b958605441faddc48343b3c83a6c9615b4f69aa4ea78440ace2a7015a994ea56aef99c83ce28cfdd8cdc8359487b0b050d33df895e504b12bd8d8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Markdown \
perl-Text-Markdown"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
perl--MODULE-COMPAT-5.44.0 \
update-alternatives"

inherit rpm
