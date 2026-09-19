SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.19.1"

RPM_NAME = "python313-ruamel.yaml-0.19.1-1.3.noarch.rpm"
RPM_HASH = "9d3bf2da12c23a8cca3dc459084f7397b7ef9507279467d0ed60004bd33b73f110a08e7f12907857d2a2520eceb2dce6301a8a1ccf2a5e01e097e9d6ca3823f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.yaml \
python3.13dist-ruamel.yaml \
python313-ruamel.yaml \
python3dist-ruamel.yaml"

RDEPENDS:${PN} += "python-abi \
python313-ruamel.yaml.clib"

inherit rpm
