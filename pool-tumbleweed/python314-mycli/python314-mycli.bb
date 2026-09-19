SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.27.2"

RPM_NAME = "python314-mycli-1.27.2-3.5.noarch.rpm"
RPM_HASH = "41dff3b386a9403b988a3a8e25760609e4fda1063c4ffe7c73d00b4c896b298ed35c7f50ae12d57805537f743e1feae7edc911a1f31780030ef555bce2b54ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mycli \
python314-mycli \
python3dist-mycli"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyMySQL \
python314-Pygments \
python314-cli-helpers \
python314-click \
python314-configobj \
python314-cryptography \
python314-prompt-toolkit \
python314-pyaes \
python314-pyperclip \
python314-sqlglot \
python314-sqlparse \
update-alternatives"

inherit rpm
