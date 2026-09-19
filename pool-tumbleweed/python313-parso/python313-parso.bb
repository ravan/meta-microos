SUMMARY = "An autocompletion tool for Python"
DESCRIPTION = "Parso is a Python parser that supports error recovery and round-trip \
parsing for different Python versions (in multiple Python \
versions). Parso is also able to list multiple syntax errors in your \
python file. \
 \
Parso has been battle-tested by jedi. It was pulled out of jedi to be \
useful for other projects as well. \
 \
Parso consists of a small API to parse Python and analyse the syntax \
tree."
LICENSE = "MIT & Python-2.0"

PV = "0.8.7"

RPM_NAME = "python313-parso-0.8.7-2.1.noarch.rpm"
RPM_HASH = "d4f18554f3c98e1cf45e41ea1d3eb27bc8b87a88bab9d9ed846b2a002e71a9b27b5fd4bb35a166a02270a7bdcf9221fc6ef985ecb3afcf1b9611de91e799f4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parso \
python3.13dist-parso \
python313-parso \
python3dist-parso"

RDEPENDS:${PN} += "python-abi"

inherit rpm
