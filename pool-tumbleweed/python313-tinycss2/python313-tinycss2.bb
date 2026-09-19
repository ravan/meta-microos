SUMMARY = "A tiny CSS parser"
DESCRIPTION = "tinycss2 is a low-level CSS parser and generator written in Python: \
it can parse strings, return objects representing tokens and blocks, \
and generate CSS strings corresponding to these objects. \
 \
Based on the CSS Syntax Level 3 specification, tinycss2 knows the \
grammar of CSS but doesn't know specific rules, properties or values \
supported in various CSS modules."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python313-tinycss2-1.5.1-1.4.noarch.rpm"
RPM_HASH = "603c3e9b4f19949d05328bbbc366d7630e964724191b6349ad9dd681b05f1928e3373e77780c24670ca3c9abbe593fe80f85707cb7d6c237008c49b0f7651f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinycss2 \
python3.13dist-tinycss2 \
python313-tinycss2 \
python3dist-tinycss2"

RDEPENDS:${PN} += "python-abi \
python313-webencodings"

inherit rpm
