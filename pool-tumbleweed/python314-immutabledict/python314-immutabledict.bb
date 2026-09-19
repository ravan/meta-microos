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

RPM_NAME = "python314-immutabledict-4.3.1-2.2.noarch.rpm"
RPM_HASH = "6489d4caa946131016e7740df04d9ede1c8ef9392631218e57346b1abf332161cf6c0afdea88216c5979f922c1182bba189211bc1c673ad3581064e30d984495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-immutabledict \
python314-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
