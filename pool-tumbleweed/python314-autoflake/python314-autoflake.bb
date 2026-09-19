SUMMARY = "Program to removes unused Python imports and variables"
DESCRIPTION = "Autoflake removes unused imports and unused variables from Python \
code. It makes use of pyflakes to do this. \
 \
By default, autoflake only removes unused imports for modules that \
are part of the standard library. (Other modules may have side \
effects that make them unsafe to remove automatically.) Removal of \
unused variables is also disabled by default. \
 \
autoflake also removes useless pass statements."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python314-autoflake-2.3.1-2.6.noarch.rpm"
RPM_HASH = "820f43a14bdfc21809624fc1ee2f57c6e751d14a770108d970ec48d7b10798e82f3babddbf3e778a9693fe0a0fdb46ff3506f6d452cc684415fb7413e9dcbd70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autoflake \
python314-autoflake \
python3dist-autoflake"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pyflakes \
python314-tomli"

inherit rpm
