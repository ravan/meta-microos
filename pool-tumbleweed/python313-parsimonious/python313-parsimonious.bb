SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python313-parsimonious-0.11.0-1.4.noarch.rpm"
RPM_HASH = "49b717cd1d18f400475cddc1f21ac9cd535ba22e6f64d252ab85b0df927aa43589ac85aa6871f99b5af68da27661245b2540ea1ce2cb7fe74b7c6077e29fc48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsimonious \
python3.13dist-parsimonious \
python313-parsimonious \
python3dist-parsimonious"

RDEPENDS:${PN} += "python-abi \
python313-regex"

inherit rpm
