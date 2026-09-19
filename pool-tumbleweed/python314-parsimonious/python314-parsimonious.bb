SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python314-parsimonious-0.11.0-1.4.noarch.rpm"
RPM_HASH = "55cfc02975e6f2defc6e36425cc810ac58965bb2e2e9193e11da8d4c0b4d8ad48305816ee07b07ceb93d5ab76a8b788873df480da94f5abb1a08e62fccd840a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parsimonious \
python314-parsimonious \
python3dist-parsimonious"

RDEPENDS:${PN} += "python-abi \
python314-regex"

inherit rpm
