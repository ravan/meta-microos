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

RPM_NAME = "python313-textX-4.4.0-1.1.noarch.rpm"
RPM_HASH = "2fa19af5c69272f2ede8eaf5b275d1568b47e90a1507c698c4d12852d6c807eede39ef0d61f5b2c45f3a33d9c0cdbad84947b60036c3b663ae1bcc858c253bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textX \
python3.13dist-textx \
python313-textX \
python3dist-textx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Arpeggio \
update-alternatives"

inherit rpm
