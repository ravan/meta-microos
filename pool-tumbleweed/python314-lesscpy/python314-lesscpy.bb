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

RPM_NAME = "python314-lesscpy-0.15.1-4.5.noarch.rpm"
RPM_HASH = "9578939b9c0d56fcbd3734bb43aa7bbb79769ebdbfc79a71afca1f4dd2cca499a91160c1e725bda2611ccdc6f4b8e37030e45156a47da0bfde841b329c951230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lesscpy \
python314-lesscpy \
python3dist-lesscpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-ply \
python314-setuptools"

inherit rpm
