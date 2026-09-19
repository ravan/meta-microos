SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "python313-nocasedict-2.2.0-1.4.noarch.rpm"
RPM_HASH = "21cccf6410bc00f7841dae913ce7c6940b4baf876ab9eb08b38b7781ab1e07e2e31d9c5b5117f23e1095a1a0c98164960aad670861e55ebbc99b66fc58a609b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nocasedict \
python3.13dist-nocasedict \
python313-nocasedict \
python3dist-nocasedict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
