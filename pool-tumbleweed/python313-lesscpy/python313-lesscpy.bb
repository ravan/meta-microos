SUMMARY = "Lesscss compiler"
DESCRIPTION = "python LessCss Compiler. \
 \
A compiler written in python 3 for the lesscss language. \
For those of us not willing/able to have node.js installed in our environment. \
Not all features of lesscss are supported (yet). \
Some features wil probably never be supported (JavaScript evaluation). \
This program uses PLY (Python Lex-Yacc) to tokenize/parse the input."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python313-lesscpy-0.15.1-4.5.noarch.rpm"
RPM_HASH = "2a1bcb7b14ce76839f5f0b397963af5ba4f628f0439f64aeb82e8db07ceb2592eca5b2bbed86805aadc4a98b5eca5ac0c8c6e732ee275a3becc3618d7426241f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lesscpy \
python3.13dist-lesscpy \
python313-lesscpy \
python3dist-lesscpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-ply \
python313-setuptools"

inherit rpm
