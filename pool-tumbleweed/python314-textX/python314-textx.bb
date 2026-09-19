SUMMARY = "Meta-language for DSL implementation inspired by Xtext"
DESCRIPTION = "textX is a meta-language for building Domain-Specific Languages (DSLs) in Python. \
It is inspired by Xtext. \
 \
From a single language description (grammar), textX will build a \
parser and a meta-model (a.k.a. abstract syntax) for textual \
languages. Own languages can be invented or support for already \
existing textual language or file format be built. \
 \
textX follows the syntax and semantics of Xtext, but differs in some places \
and is implemented in Python using the Arpeggio PEG parser - no grammar \
ambiguities, unlimited lookahead, interpreter style of work."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python314-textX-4.4.0-1.1.noarch.rpm"
RPM_HASH = "2ccec30bbb224302b454220b31f67dbc1df21696acf1f811bc9e425c6ad57f89c26238f28073de70c9e22eccb998b31f269ae2569bb25727b6626745023a1dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-textx \
python314-textX \
python3dist-textx"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Arpeggio \
update-alternatives"

inherit rpm
