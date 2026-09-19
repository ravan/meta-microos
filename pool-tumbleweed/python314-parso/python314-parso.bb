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

RPM_NAME = "python314-parso-0.8.7-2.1.noarch.rpm"
RPM_HASH = "740068196eb00f51e8a163a28b373d216504cc6ba90fc29bc25535ec514b7e102dbeed8fd5da15576c95b5cc6b0e07eca5cc34545566e625001e70c856f42afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parso \
python314-parso \
python3dist-parso"

RDEPENDS:${PN} += "python-abi"

inherit rpm
