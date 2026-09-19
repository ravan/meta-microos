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

RPM_NAME = "python314-tinycss2-1.5.1-1.4.noarch.rpm"
RPM_HASH = "18a644219472ce72b477f727ae634da2e6a8a86b90d02576df81956ce505b3c0ca6e7e566b94d192922f482f0e3c652b6605b390ab216f40d308e01d90aaf1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tinycss2 \
python314-tinycss2 \
python3dist-tinycss2"

RDEPENDS:${PN} += "python-abi \
python314-webencodings"

inherit rpm
