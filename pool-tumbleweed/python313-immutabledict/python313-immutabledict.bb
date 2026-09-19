SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. \
This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 \
licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in \
replacement for dictionaries where immutability is desired. The immutabledict \
constructor mimics dict, and all of the expected interfaces (iter, len, repr, \
hash, getitem) are provided. Note that an immutabledict does not guarantee the \
immutability of its values, so the utility of hash method is restricted by \
usage. \
 \
The only difference is that the copy() method of immutable takes variable \
keyword arguments, which will be present as key/value pairs in the new, \
immutable copy."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python313-immutabledict-4.3.1-2.2.noarch.rpm"
RPM_HASH = "d438eda456ed4a945748897ac590855bd64173b33307d8dd956e776c2faf1291ad8c2c9541314ce50d641afeb73e77d82b8209cf564f9040cf766360bf92d61b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-immutabledict \
python3.13dist-immutabledict \
python313-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
