SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "10.0.0"

RPM_NAME = "python314-Mathics-Scanner-10.0.0-1.2.noarch.rpm"
RPM_HASH = "b02b006dbf0ebe9ea22473e83ba8b326332a251dcd277a6daf52efcef4ed5b177ed5d823cd4387b0d4c400ea8a48d984fdf7f56e3c809e6058f9ddfa2cb91f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mathics3-scanner \
python314-Mathics-Scanner \
python314-Mathics3-Scanner \
python3dist-mathics3-scanner"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-chardet \
python314-click \
update-alternatives"

inherit rpm
