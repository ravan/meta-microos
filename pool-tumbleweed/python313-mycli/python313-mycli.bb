SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.27.2"

RPM_NAME = "python313-mycli-1.27.2-3.5.noarch.rpm"
RPM_HASH = "eb5073825963c0a091d67d79ab0a67b9f8c2f356741b6b128d755a6d943f90ea47fae4db9ba035c4263515c0afc7d90fe3461df8c2b06afc9af844ee245dd436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mycli \
python3.13dist-mycli \
python313-mycli \
python3dist-mycli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyMySQL \
python313-Pygments \
python313-cli-helpers \
python313-click \
python313-configobj \
python313-cryptography \
python313-prompt-toolkit \
python313-pyaes \
python313-pyperclip \
python313-sqlglot \
python313-sqlparse \
update-alternatives"

inherit rpm
