SUMMARY = "Python module which parses and emits TOML"
DESCRIPTION = "Python toml allows to parse and create toml configuration files. \
See below the toml specification link. \
 \
Usage \
toml.loads --- takes a string to be parsed as toml and returns \
the corresponding dictionary \
toml.dumps --- takes a dictionary and returns a string which \
is the contents of the corresponding toml file. \
 \
There are other functions which can be used to dump and load various \
fragments of toml but dumps and loads will cover most usage. \
 \
Current Version of TOML Specification \
https://github.com/mojombo/toml/blob/v0.4.0/README.md"
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python314-toml-0.10.2-4.5.noarch.rpm"
RPM_HASH = "e1bfdbbede9d52f4851e0eedaf2f86550be2981876f8e259ec87266403e9067f4887182fb603dcc8832245badfe2b60841ec20bd0358532491a356350c4687f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-toml \
python314-toml \
python3dist-toml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
