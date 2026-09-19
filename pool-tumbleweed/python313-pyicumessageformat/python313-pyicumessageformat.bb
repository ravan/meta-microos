SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-pyicumessageformat-1.0.0-1.28.noarch.rpm"
RPM_HASH = "bc216fa02c6f470c0818e26502b52e8cbe2a2bbaf916daf0952cc813a410112d361fd8334ebf643d5fe17b0eb0e303e83b25f5d93e0f169e8cd4778c4bc756bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyicumessageformat \
python3.13dist-pyicumessageformat \
python313-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
