SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.27.2"

RPM_NAME = "python311-mycli-1.27.2-3.3.noarch.rpm"
RPM_HASH = "6436082c5b3403d364adf631c920f0e8a156837bfc70f967ef688906fa043899a50ab45de89d3be19a6bac6b06a5542b23d36e4d8e41691f50fadb937af06d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mycli \
python311-mycli \
python3dist-mycli"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyMySQL \
python311-Pygments \
python311-cli-helpers \
python311-click \
python311-configobj \
python311-cryptography \
python311-prompt-toolkit \
python311-pyaes \
python311-pyperclip \
python311-sqlglot \
python311-sqlparse \
update-alternatives"

inherit rpm
