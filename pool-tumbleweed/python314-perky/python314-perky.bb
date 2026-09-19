SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python314-perky-0.10-1.1.noarch.rpm"
RPM_HASH = "6c5dfed1ae3e5cd641a0b9016bb80e4136706f584c9ed075796e6c1db4e1d50a82bd2c63b5a584fbd891b3f07f0304aec8c4c9df65a31942393ede49bff70fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-perky \
python314-perky \
python3dist-perky"

RDEPENDS:${PN} += "python-abi \
python314-big"

inherit rpm
