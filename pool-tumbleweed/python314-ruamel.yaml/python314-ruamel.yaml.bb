SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.19.1"

RPM_NAME = "python314-ruamel.yaml-0.19.1-1.3.noarch.rpm"
RPM_HASH = "2417489278be15967227fa58b3c1085f2b704ab0ad19ce69a563244c0f6b7bc14a0024f3507e938ecf6749cd644657d89b423d8cf5fe7c127ede4cf86c61a492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ruamel.yaml \
python314-ruamel.yaml \
python3dist-ruamel.yaml"

RDEPENDS:${PN} += "python-abi \
python314-ruamel.yaml.clib"

inherit rpm
