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

RPM_NAME = "python313-toml-0.10.2-4.5.noarch.rpm"
RPM_HASH = "ce21bf5237fcc2c2bf9e46f027403df1cad4b6d940722d10edb51bf1e3a3e60afa82ebc7fdf251189990a7fb944f1d7dd1fa2536f87ab28fdcaf475b6000e146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toml \
python3.13dist-toml \
python313-toml \
python3dist-toml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
